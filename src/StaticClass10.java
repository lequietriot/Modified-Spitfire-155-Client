import java.util.Arrays;

public class StaticClass10 {

    public static int staticInt52;
    static byte[] skipFlags = new byte[2048];
    static byte[] staticByteArray2 = new byte[2048];
    static Buffer[] staticBufferArray1 = new Buffer[2048];
    static int playersInsideViewportCount = 0;
    static int[] playerIndexesInsideViewport = new int[2048];
    static int playersOutsideViewportCount = 0;
    static int[] playerIndexesOutsideViewport = new int[2048];
    static int[] staticIntArray22 = new int[2048];
    static int[] staticIntArray18 = new int[2048];
    static int[] staticIntArray20 = new int[2048];
    static int playersRequiringFlagUpdateCount = 0;
    static int[] playerIndexesRequiringFlagUpdates = new int[2048];
    static Buffer staticBuffer2 = new Buffer(new byte[5000]);

    StaticClass10() throws Throwable {
        throw new Error();
    }

    static final void initGPI(Packet packet_0) {
        packet_0.initBitAccess();
        int i_2 = Client.staticInt293;
        Player player_3 = BufferWrapper.staticPlayer1 = Client.players[i_2] = new Player();
        player_3.playerIndex = i_2;
        int i_4 = packet_0.readBits(30);
        byte b_5 = (byte) (i_4 >> 28);
        int i_6 = i_4 >> 14 & 0x3fff;
        int i_7 = i_4 & 0x3fff;
        player_3.intArray103[0] = i_6 - DataClass10.staticInt111;
        player_3.int626 = (player_3.intArray103[0] << 7) + (player_3.method696() << 6);
        player_3.intArray104[0] = i_7 - Class4.staticInt53;
        player_3.int609 = (player_3.intArray104[0] << 7) + (player_3.method696() << 6);
        DataClass14.staticInt156 = (player_3.int683 = b_5 * 612649739) * 649046179;

        // player appearance
        if (staticBufferArray1[i_2] != null)
            player_3.appendAppearanceBlock(staticBufferArray1[i_2]);

        playersInsideViewportCount = 0;
        playerIndexesInsideViewport[playersInsideViewportCount++] = i_2;
        skipFlags[i_2] = 0;
        playersOutsideViewportCount = 0;

        for (int i_8 = 1; i_8 < 2048; i_8++)
            if (i_8 != i_2) {
                int i_9 = packet_0.readBits(18);
                int i_10 = i_9 >> 16;
                int i_11 = i_9 >> 8 & 0x255;
                int i_12 = i_9 & 0x255;
                staticIntArray22[i_8] = (i_10 << 28) + (i_11 << 14) + i_12;
                staticIntArray18[i_8] = 0;
                staticIntArray20[i_8] = -1;
                playerIndexesOutsideViewport[playersOutsideViewportCount++] = i_8;
                skipFlags[i_8] = 0;
            }

        packet_0.finishBitAccess();
    }

    static final void updatePlayers(Packet buffer, int i_1) {
        final int bufferOffset = buffer.off;
        playersRequiringFlagUpdateCount = 0;
        int skipCount = 0;
        buffer.initBitAccess();

        for (int index = 0; index < playersInsideViewportCount; index++) {
            final int playerIndex = playerIndexesInsideViewport[index];
            if ((skipFlags[playerIndex] & 0x1) == 0) {
                if (skipCount > 0) {
                    --skipCount;
                    skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                } else {
                    final boolean updateRequired = buffer.readBits(1) == 1; // requires flag based updates?

                    if (!updateRequired) {
                        skipCount = writeSkipCount(buffer);
                        skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                    } else {
                        updateLocalPlayer(buffer, playerIndex);
                    }
                }
            }
        }

        buffer.finishBitAccess();

        if (skipCount != 0)
            throw new RuntimeException();
        else {
            buffer.initBitAccess();

            for (int index = 0; index < playersInsideViewportCount; index++) {
                final int playerIndex = playerIndexesInsideViewport[index];
                if ((skipFlags[playerIndex] & 0x1) != 0) {
                    if (skipCount > 0) {
                        --skipCount;
                        skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                    } else {
                        final boolean updateRequired = buffer.readBits(1) == 1;
                        if (!updateRequired) {
                            skipCount = writeSkipCount(buffer);
                            skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                        } else {
                            updateLocalPlayer(buffer, playerIndex);
                        }
                    }
                }
            }

            buffer.finishBitAccess();

            if (skipCount != 0) {
                throw new RuntimeException();
            } else {

                /*
                Start of global player updating.

                The server keeps the client informed of regional changes in player movement outside of the local area
                 */

                buffer.initBitAccess();

                for (int index = 0; index < playersOutsideViewportCount; index++) {
                    final int playerIndex = playerIndexesOutsideViewport[index];
                    if ((skipFlags[playerIndex] & 0x1) != 0) {
                        if (skipCount > 0) {
                            --skipCount;
                            skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                        } else {
                            final boolean updateRequired = buffer.readBits(1) == 1;
                            if (!updateRequired) {
                                skipCount = writeSkipCount(buffer);
                                skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                            } else if (updateGlobalPlayers(buffer, playerIndex)) {
                                skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                            }
                        }
                    }
                }

                buffer.finishBitAccess();
                if (skipCount != 0)
                    throw new RuntimeException();
                else {
                    buffer.initBitAccess();

                    for (int index = 0; index < playersOutsideViewportCount; index++) {
                        final int playerIndex = playerIndexesOutsideViewport[index];
                        if ((skipFlags[playerIndex] & 0x1) == 0) {
                            if (skipCount > 0) {
                                --skipCount;
                                skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                            } else {
                                final boolean updateRequired = buffer.readBits(1) == 1;

                                if (!updateRequired) {
                                    skipCount = writeSkipCount(buffer);
                                    skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                                } else if (updateGlobalPlayers(buffer, playerIndex))
                                    skipFlags[playerIndex] = (byte) (skipFlags[playerIndex] | 0x2);
                            }
                        }
                    }

                    buffer.finishBitAccess();
                    if (skipCount != 0) {
                        throw new RuntimeException();
                    }
                    else {
                        playersInsideViewportCount = 0;
                        playersOutsideViewportCount = 0;

                        for (int index = 1; index < 2048; index++) {
                            skipFlags[index] = (byte) (skipFlags[index] >> 1);
                            Player globalPlayer = Client.players[index];
                            if (globalPlayer != null) {
                                playerIndexesInsideViewport[playersInsideViewportCount++] = index;
                            } else {
                                playerIndexesOutsideViewport[playersOutsideViewportCount++] = index;
                            }
                        }

                        appendPlayerUpdateMasks(buffer);
                        if (i_1 != buffer.off - bufferOffset) {
                            throw new RuntimeException(buffer.off - bufferOffset + " " + i_1);
                        }

                    }
                }
            }
        }
    }

    static int writeSkipCount(Packet buffer) { // skip players
        final int skipSizeType = buffer.readBits(2);

        int skipSize;
        if (skipSizeType == 0) {
            return 0;
        } else if (skipSizeType == 1) {
            skipSize = buffer.readBits(5); // range of 0-31
        } else if (skipSizeType == 2) {
            skipSize = buffer.readBits(8); //
        } else {
            skipSize = buffer.readBits(11);
        }
        return skipSize;
    }

    static void updateLocalPlayer(Packet buffer, int playerIndex) {
        final boolean requiresFlagBasedUpdates = buffer.readBits(1) == 1; // no mask update needed

        if (requiresFlagBasedUpdates) {
            playerIndexesRequiringFlagUpdates[playersRequiringFlagUpdateCount++] = playerIndex;
        }

        /*
        These two bits indicate the type of updating that needs to be done to the this player.

        There are several types of updates that can be performed.

        Type 0 is used to remove a player from the local list and add it to the external player list.
        If the "update" flag was set, however, the player is not removed from the local list and is just added to the list of players needing flag-based updating.
        In this case the player receives no movement update.
        If the update flag was not set, the player is transfered from the local list to the external list and a one bit flag is read to determine if the player is to be updated by the external player update method.
        If so, it is updated immediately.

        Type 1 is used in walking. A three bit value containing the direction of movement is read and used to determine the player's next step.

        Type 2 contains similar data to type 1, except four bits are read instead of three. This is used for running.

        Type 3 has two different cases, both of which are used for teleporting or other forms of instantaneous movement.
        A one bit flag is read to determine whether or not the player is moving more than -16 to 15 tiles away, so the client knows what data to expect.

        - Method
         */
        final int localUpdateType = buffer.readBits(2);

        Player localPlayer = Client.players[playerIndex];

        if (localUpdateType == 0) { // indicates to remove a player from the local list and add it to the global player list
            if (requiresFlagBasedUpdates) {
                localPlayer.bool76 = false;
            } else if (playerIndex == Client.staticInt293) {
                throw new RuntimeException();
            } else {
                staticIntArray22[playerIndex] = (Class4.staticInt53 + localPlayer.intArray104[0] >> 13) + (localPlayer.int683 * 649046179 << 28) + (localPlayer.intArray103[0] + DataClass10.staticInt111 >> 13 << 14);
                if (localPlayer.int621 != -1) {
                    staticIntArray18[playerIndex] = localPlayer.int621;
                } else {
                    staticIntArray18[playerIndex] = localPlayer.int639;
                }

                staticIntArray20[playerIndex] = localPlayer.int620;
                Client.players[playerIndex] = null;

                /*
                 A one bit flag is read to determine if the player should be updated by the global player update method.
                 If so, it is updated immediately.
                 */
                final boolean updateFlag = buffer.readBits(1) == 1;

                if (updateFlag) {
                    updateGlobalPlayers(buffer, playerIndex);
                }

            }
        } else {
            int i_6;
            int i_7;
            int i_8;
            if (localUpdateType == 1) { // represents the player is walking
                // these 3 bits indicate the direction the player is walking
                i_6 = buffer.readBits(3);
                i_7 = localPlayer.intArray103[0];
                i_8 = localPlayer.intArray104[0];
                if (i_6 == 0) {
                    --i_7;
                    --i_8;
                } else if (i_6 == 1)
                    --i_8;
                else if (i_6 == 2) {
                    ++i_7;
                    --i_8;
                } else if (i_6 == 3)
                    --i_7;
                else if (i_6 == 4)
                    ++i_7;
                else if (i_6 == 5) {
                    --i_7;
                    ++i_8;
                } else if (i_6 == 6)
                    ++i_8;
                else if (i_6 == 7) {
                    ++i_7;
                    ++i_8;
                }

                if (Client.staticInt293 == playerIndex && (localPlayer.int626 < 1536 || localPlayer.int609 < 1536 || localPlayer.int626 >= 11776 || localPlayer.int609 >= 11776)) {
                    localPlayer.method698(i_7, i_8);
                    localPlayer.bool76 = false;
                } else if (requiresFlagBasedUpdates) {
                    localPlayer.bool76 = true;
                    localPlayer.int689 = i_7;
                    localPlayer.int690 = i_8;
                } else {
                    localPlayer.bool76 = false;
                    localPlayer.method697(i_7, i_8, staticByteArray2[playerIndex]);
                }

            } else if (localUpdateType == 2) { // represents the player is running
                // these 4 bits indicate the player is running
                i_6 = buffer.readBits(4);
                i_7 = localPlayer.intArray103[0];
                i_8 = localPlayer.intArray104[0];
                if (i_6 == 0) {
                    i_7 -= 2;
                    i_8 -= 2;
                } else if (i_6 == 1) {
                    --i_7;
                    i_8 -= 2;
                } else if (i_6 == 2)
                    i_8 -= 2;
                else if (i_6 == 3) {
                    ++i_7;
                    i_8 -= 2;
                } else if (i_6 == 4) {
                    i_7 += 2;
                    i_8 -= 2;
                } else if (i_6 == 5) {
                    i_7 -= 2;
                    --i_8;
                } else if (i_6 == 6) {
                    i_7 += 2;
                    --i_8;
                } else if (i_6 == 7)
                    i_7 -= 2;
                else if (i_6 == 8)
                    i_7 += 2;
                else if (i_6 == 9) {
                    i_7 -= 2;
                    ++i_8;
                } else if (i_6 == 10) {
                    i_7 += 2;
                    ++i_8;
                } else if (i_6 == 11) {
                    i_7 -= 2;
                    i_8 += 2;
                } else if (i_6 == 12) {
                    --i_7;
                    i_8 += 2;
                } else if (i_6 == 13)
                    i_8 += 2;
                else if (i_6 == 14) {
                    ++i_7;
                    i_8 += 2;
                } else if (i_6 == 15) {
                    i_7 += 2;
                    i_8 += 2;
                }

                if (Client.staticInt293 != playerIndex || localPlayer.int626 >= 1536 && localPlayer.int609 >= 1536 && localPlayer.int626 < 11776 && localPlayer.int609 < 11776) {
                    if (requiresFlagBasedUpdates) {
                        localPlayer.bool76 = true;
                        localPlayer.int689 = i_7;
                        localPlayer.int690 = i_8;
                    } else {
                        localPlayer.bool76 = false;
                        localPlayer.method697(i_7, i_8, staticByteArray2[playerIndex]);
                    }
                } else {
                    localPlayer.method698(i_7, i_8);
                    localPlayer.bool76 = false;
                }

            } else { // type 3 for teleporting and/or other forms of instantaneous movement

                /*
                 This bit is a flag that determines if the player is moving more than -16 to 15 tiles away.
                 If the player is NOT moving more than -16 to 15 tiles away its flag is false
                 If the player IS moving more than -16 to 15 tiles away the flag is true.
                */
                i_6 = buffer.readBits(1);
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                if (i_6 == 0) { // the player is NOT moving more than -16 to 15 tiles away

                    /*
                     For these next 12 bits.

                     The highest two bits represent the offset to the player's plane.

                     The next 5 bits represent the delta X position while hte other 5 bits represent the delta Y position.

                     X and Y values less than 0 need to have 32 added to it before it's sent to the client.

                     This is used for teleporting within a players local viewport.

                     - Method
                      */

                    i_7 = buffer.readBits(12);

                    i_8 = i_7 >> 10;
                    i_9 = i_7 >> 5 & 0x1f;

                    if (i_9 > 15) {
                        i_9 -= 32;
                    }

                    i_10 = i_7 & 0x1f;

                    if (i_10 > 15) {
                        i_10 -= 32;
                    }

                    i_11 = localPlayer.intArray103[0] + i_9;
                    i_12 = i_10 + localPlayer.intArray104[0];
                    if (playerIndex != Client.staticInt293 || localPlayer.int626 >= 1536 && localPlayer.int609 >= 1536 && localPlayer.int626 < 11776 && localPlayer.int609 < 11776) {
                        if (requiresFlagBasedUpdates) {
                            localPlayer.bool76 = true;
                            localPlayer.int689 = i_11;
                            localPlayer.int690 = i_12;
                        } else {
                            localPlayer.bool76 = false;
                            localPlayer.method697(i_11, i_12, staticByteArray2[playerIndex]);
                        }
                    } else {
                        localPlayer.method698(i_11, i_12);
                        localPlayer.bool76 = false;
                    }

                    localPlayer.int683 = 612649739 * (byte) (i_8 + localPlayer.int683 * 649046179 & 0x3);
                    if (playerIndex == Client.staticInt293)
                        DataClass14.staticInt156 = localPlayer.int683 * 649046179;

                } else { // indicate that the player is moving more than -16 to 15 tiles away.

                    /*
                    For these next 30 bits.

                    A 30 bit packed integer is read.

                    The highest two bits contain the plane offset.

                    The X and Y offsets are 14 bits each. This allows for a much wider range of coordinate values.

                    This can be used for teleporting the local player to another region (or outside the players viewport)

                    or for moving the player more than -16 to 15 tiles within the local players viewport.

                    - Method

                     */

                    i_7 = buffer.readBits(30);
                    i_8 = i_7 >> 28;
                    i_9 = i_7 >> 14 & 0x3fff;
                    i_10 = i_7 & 0x3fff;
                    i_11 = (i_9 + DataClass10.staticInt111 + localPlayer.intArray103[0] & 0x3fff) - DataClass10.staticInt111;
                    i_12 = (i_10 + Class4.staticInt53 + localPlayer.intArray104[0] & 0x3fff) - Class4.staticInt53;
                    if (playerIndex == Client.staticInt293 && (localPlayer.int626 < 1536 || localPlayer.int609 < 1536 || localPlayer.int626 >= 11776 || localPlayer.int609 >= 11776)) {
                        localPlayer.method698(i_11, i_12);
                        localPlayer.bool76 = false;
                    } else if (requiresFlagBasedUpdates) {
                        localPlayer.bool76 = true;
                        localPlayer.int689 = i_11;
                        localPlayer.int690 = i_12;
                    } else {
                        localPlayer.bool76 = false;
                        localPlayer.method697(i_11, i_12, staticByteArray2[playerIndex]);
                    }

                    localPlayer.int683 = 612649739 * (byte) (i_8 + localPlayer.int683 * 649046179 & 0x3);
                    if (Client.staticInt293 == playerIndex) {
                        DataClass14.staticInt156 = localPlayer.int683 * 649046179;
                    }

                }
            }
        }
    }

    static boolean updateGlobalPlayers(Packet buffer, int playerIndex) {

        /*
        Like in local player updating, a two bit "type" value is read to see what update needs to be done.

        The types of updates are

        Type 0 is the counterpart of local player updating's type 0 and is used to add a player to the local list from the external list.
        First, a bit is read to see if the external player needs its regional location updated before it is added to the list.
        If it does, the method is called again and one of the other types are used to update the player's regional location before adding it to the local player list.
        After this, two six bit values representing the player's delta x and delta y values from the start of the region the player is in are read.
        Next, a one bit "update" flag is read to see if the player requires any further flag-based updates.
        If a player is updated using this update type, it will be counted as having been skipped in the current update.

        Type 1 is used to inform the client of a change to an external player's plane. Two bits are used to represent the offset from the stored plane value.

        Type 2 is similar to the movement change types in local player updating.
        It contains a 5 bit packed integer containing a plane offset in the high two bits and the direction of movement in the low three bits.
        This type is used for informing a client about an external player moving to a region adjacent to its current one.

        Type 3 is similar to type 2, except it is used for clients that do not move to an adjacent region.
        An 18 bit packed integer is read containing the plane offset as the high two bits and the regional x and y offsets as the next 8 bits each.

        - Method
         */
        final int globalUpdateType = buffer.readBits(2);

        int i_4;
        int i_5;
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        if (globalUpdateType == 0) {

            // check if the external player needs their regional position updated before being added to the local list
            boolean needsRegionalPositionUpdated = buffer.readBits(1) == 1;

            if (needsRegionalPositionUpdated) {
                updateGlobalPlayers(buffer, playerIndex);
            }

            final int xPos = buffer.readBits(13);
            final int yPos = buffer.readBits(13);
            boolean requiresFlagUpdates = buffer.readBits(1) == 1;

            if (requiresFlagUpdates) {
                playerIndexesRequiringFlagUpdates[playersRequiringFlagUpdateCount++] = playerIndex;
            }

            if (Client.players[playerIndex] != null) {
                throw new RuntimeException();
            } else {
                Player globalPlayer = Client.players[playerIndex] = new Player();
                globalPlayer.playerIndex = playerIndex;

                if (staticBufferArray1[playerIndex] != null) {
                    globalPlayer.appendAppearanceBlock(staticBufferArray1[playerIndex]);
                }

                globalPlayer.int639 = staticIntArray18[playerIndex];
                globalPlayer.int620 = staticIntArray20[playerIndex];
                i_8 = staticIntArray22[playerIndex];
                i_9 = i_8 >> 28;
                i_10 = i_8 >> 14 & 0xff;
                i_11 = i_8 & 0xff;
                globalPlayer.byteArray12[0] = staticByteArray2[playerIndex];
                globalPlayer.int683 = 612649739 * (byte) i_9;
                globalPlayer.method698((i_10 << 13) + xPos - DataClass10.staticInt111, yPos + (i_11 << 13) - Class4.staticInt53);
                globalPlayer.bool76 = false;
                return true;
            }
        } else if (globalUpdateType == 1) { // inform the client of a change to an external player's plane
            final int planeOffset = buffer.readBits(2); // These two bits are used to represent the offset from the stored plane value
            i_5 = staticIntArray22[playerIndex];
            staticIntArray22[playerIndex] = ((planeOffset + (i_5 >> 28) & 0x3) << 28) + (i_5 & 0xfffffff);
            return false;
        } else {
            int i_6;
            int i_7;
            if (globalUpdateType == 2) { // informs the client about a global player moving to a region adjacent to its current one
                i_4 = buffer.readBits(5); // contains the plane offset in the high two bits and the direction of movement in the low three bits
                i_5 = i_4 >> 3;
                i_6 = i_4 & 0x7;
                i_7 = staticIntArray22[playerIndex];
                i_8 = (i_7 >> 28) + i_5 & 0x3;
                i_9 = i_7 >> 14 & 0xff;
                i_10 = i_7 & 0xff;
                if (i_6 == 0) {
                    --i_9;
                    --i_10;
                }

                if (i_6 == 1)
                    --i_10;

                if (i_6 == 2) {
                    ++i_9;
                    --i_10;
                }

                if (i_6 == 3)
                    --i_9;

                if (i_6 == 4)
                    ++i_9;

                if (i_6 == 5) {
                    --i_9;
                    ++i_10;
                }

                if (i_6 == 6)
                    ++i_10;

                if (i_6 == 7) {
                    ++i_9;
                    ++i_10;
                }

                staticIntArray22[playerIndex] = i_10 + (i_8 << 28) + (i_9 << 14);
                return false;
            } else { // similar to type 2, except it is used for clients that do not move to an adjacent region
                i_4 = buffer.readBits(18); // containing the plane offset as the high two bits and the regional x and y offsets as the next 8 bits each
                i_5 = i_4 >> 16;
                i_6 = i_4 >> 8 & 0xff;
                i_7 = i_4 & 0xff;
                i_8 = staticIntArray22[playerIndex];
                i_9 = i_5 + (i_8 >> 28) & 0x3;
                i_10 = (i_8 >> 14) + i_6 & 0xff;
                i_11 = i_8 + i_7 & 0xff;
                staticIntArray22[playerIndex] = i_11 + (i_9 << 28) + (i_10 << 14);
                return false;
            }
        }
    }

    // TODO player update masks
    static final void appendPlayerUpdateMasks(Packet buffer) {
        for (int count = 0; count < playersRequiringFlagUpdateCount; count++) {

            final int playerIndex = playerIndexesRequiringFlagUpdates[count];
            final Player player = Client.players[playerIndex];

            int mask = buffer.readUByte();

            if ((mask & 0x4) != 0) {
                mask += buffer.readUByte() << 8;
            }

            byte b_6 = -1;

            // face entity
            if ((mask & 0x80) != 0) {
                player.int620 = buffer.readUShortLE();
                if (player.int620 == 65535) {
                    player.int620 = -1;
                }
            }

            int i_7;

            // gfx
            if ((mask & 0x800) != 0) {
                // gfx id
                player.int640 = buffer.readUShortLEA();
                // delay
                i_7 = buffer.readIntME();

                System.out.println("id" + player.int640 + " delay: " + i_7);

                player.int613 = i_7 >> 16; // height
                player.int630 = (i_7 & 0xffff) + Client.staticInt166; // delay
                player.int631 = 0;
                player.int629 = 0;

                if (player.int630 > Client.staticInt166) {
                    player.int631 = -1;
                }

                if (player.int640 == 65535) {
                    player.int640 = -1;
                }
            }

            // appearance mask
            if ((mask & 0x2) != 0) {
                i_7 = buffer.readUByteA();

                byte[] bytes_8 = new byte[i_7];
                Buffer buffer_9 = new Buffer(bytes_8);
                buffer.method489(bytes_8, 0, i_7);
                staticBufferArray1[playerIndex] = buffer_9;
                player.appendAppearanceBlock(buffer_9);
            }

            if ((mask & 0x1000) != 0) {
                b_6 = buffer.method440();
            }

            if ((mask & 0x400) != 0) {
                staticByteArray2[playerIndex] = buffer.method472();
            }

            // context menu
            if ((mask & 0x100) != 0) {
                for (i_7 = 0; i_7 < 3; i_7++) {
                    player.op[i_7] = buffer.method448();
                }
            }

            // forced movement
            if ((mask & 0x200) != 0) {
                player.int622 = buffer.method471();
                player.int619 = buffer.method471();
                player.int632 = buffer.method470();
                player.int614 = buffer.method470();
                player.int636 = buffer.readUShortLEA() + Client.staticInt166;
                player.int635 = buffer.readUShortLE() + Client.staticInt166;
                player.int641 = buffer.readUShortLEA();
                if (player.bool76) {
                    player.int622 += player.int689;
                    player.int619 += player.int690;
                    player.int632 += player.int689;
                    player.int614 += player.int690;
                    player.int611 = 0;
                } else {
                    player.int622 += player.intArray103[0];
                    player.int619 += player.intArray104[0];
                    player.int632 += player.intArray103[0];
                    player.int614 += player.intArray104[0];
                    player.int611 = 1;
                }

                player.int625 = 0;
            }

            int i_10;
            int i_11;
            int i_14;
            int i_18;

            // hit mask
            if ((mask & 0x20) != 0) {
                i_7 = buffer.readUByteS();
                int i_12;
                int i_13;
                int i_19;
                if (i_7 > 0)
                    for (i_18 = 0; i_18 < i_7; i_18++) {
                        i_10 = -1;
                        i_11 = -1;
                        i_12 = -1;
                        i_19 = buffer.method453();
                        if (i_19 == 32767) {
                            i_19 = buffer.method453();
                            i_11 = buffer.method453();
                            i_10 = buffer.method453();
                            i_12 = buffer.method453();
                        } else if (i_19 != 32766)
                            i_11 = buffer.method453();
                        else
                            i_19 = -1;

                        i_13 = buffer.method453();
                        player.method610(i_19, i_11, i_10, i_12, Client.staticInt166, i_13);
                    }

                i_18 = buffer.readUByte();
                if (i_18 > 0)
                    for (i_19 = 0; i_19 < i_18; i_19++) {
                        i_10 = buffer.method453();
                        i_11 = buffer.method453();
                        if (i_11 != 32767) {
                            i_12 = buffer.method453();
                            i_13 = buffer.readUByteS();
                            i_14 = i_11 > 0 ? buffer.readUByteS() : i_13;
                            player.method611(i_10, Client.staticInt166, i_11, i_12, i_13, i_14);
                        } else
                            player.method612(i_10);
                    }
            }

            // animation
            if ((mask & 0x8) != 0) {
                i_7 = buffer.readUShortA();
                if (i_7 == 65535) {
                    i_7 = -1;
                }

                i_18 = buffer.readUByte();
                Client.staticMethod275(player, i_7, i_18);
            }

            // chat mask
            if ((mask & 0x10) != 0) {
                i_7 = buffer.readUShortLE();

                int rights =  buffer.readUByte();

                Class6 class6_20 = (Class6) StaticClass26.staticMethod155(Class6.staticMethod175(),rights);

                boolean bool_22 = buffer.readUByteA() == 1;
                i_10 = buffer.readUByteN();

                i_11 = buffer.off;

                if (player.name != null && player.playerDef1 != null) {
                    boolean bool_23 = false;
                    if (class6_20.bool17 && Client.staticMethod356(player.name))
                        bool_23 = true;

                    if (!bool_23 && Client.staticInt291 == 0 && !player.bool78) {
                        staticBuffer2.off = 0;

                        buffer.method488(staticBuffer2.buf, 0, i_10);
                        staticBuffer2.off = 0;
                        String string_24 = TypeFace.staticMethod495(StaticClass51.staticMethod215(StaticClass50.staticMethod207(staticBuffer2)));

                        player.string43 = string_24.trim();
                        player.int616 = i_7 >> 8;
                        player.int617 = i_7 & 0xff;
                        player.int615 = 150;
                        player.bool70 = bool_22;
                        player.bool71 = BufferWrapper.staticPlayer1 != player && class6_20.bool17 && Client.staticString317 != "" && string_24.toLowerCase().indexOf(Client.staticString317) == -1;
                        if (class6_20.bool16)
                            i_14 = bool_22 ? 91 : 1;
                        else
                            i_14 = bool_22 ? 90 : 2;

                        if (class6_20.int259 != -1) {
                            int i_17 = class6_20.int259;
                            String string_16 = "<img=" + i_17 + ">";
                            StaticClass12.staticMethod59(i_14, string_16 + player.name, string_24);
                        } else
                            StaticClass12.staticMethod59(i_14, player.name, string_24);
                    }
                }

                buffer.off = i_11 + i_10;
            }

            // face position/change direction
            if ((mask & 0x40) != 0) {
                player.int621 = buffer.readUShortLEA();
                if (player.int611 == 0) {
                    player.int639 = player.int621;
                    player.int621 = -1;
                }
            }

            // force chat
            if ((mask & 0x1) != 0) {
                player.string43 = buffer.method448();
                if (player.string43.charAt(0) == 126) {
                    player.string43 = player.string43.substring(1);
                    StaticClass12.staticMethod59(2, player.name, player.string43);
                } else if (BufferWrapper.staticPlayer1 == player)
                    StaticClass12.staticMethod59(2, player.name, player.string43);

                player.bool70 = false;
                player.int616 = 0;
                player.int617 = 0;
                player.int615 = 150;
            }

            if (player.bool76)
                if (b_6 == 127)
                    player.method698(player.int689, player.int690);
                else {
                    byte b_21;
                    if (b_6 != -1)
                        b_21 = b_6;
                    else
                        b_21 = staticByteArray2[playerIndex];

                    player.method697(player.int689, player.int690, b_21);
                }
        }

    }

}
