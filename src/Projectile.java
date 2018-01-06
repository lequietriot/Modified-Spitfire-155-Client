public final class Projectile extends Renderable {

    boolean inMotion = false;
    int animationFrame = 0;
    int time = 0;
    int spotanim;
    int int660;
    int initialX;
    int initialY;
    int initialZ;
    int int662;
    int endCycle;
    int angle;
    int initialDistance;
    int int661;
    int int659;
    SeqType animation;
    double x;
    double y;
    double z;
    double velocityX;
    double velocityY;
    double speed;
    double velocityZ;
    double offsetZ;
    int rotX;
    int rotY;

    Projectile(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
        spotanim = i_1;
        int660 = i_2;
        initialX = i_3;
        initialY = i_4;
        initialZ = i_5;
        int662 = i_6;
        endCycle = i_7;
        angle = i_8;
        initialDistance = i_9;
        int661 = i_10;
        int659 = i_11;
        inMotion = false;
        int i_12 = SpotAnim.staticMethod418(spotanim).anim;
        if (i_12 != -1)
            animation = SeqType.staticMethod438(i_12);
        else
            animation = null;

    }

    final void method614(int i_1, int i_2, int i_3, int i_4) {
        double d_6;
        if (!inMotion) {
            d_6 = i_1 - initialX;
            double d_8 = i_2 - initialY;
            double d_10 = Math.sqrt(d_6 * d_6 + d_8 * d_8);
            x = initialX + initialDistance * d_6 / d_10;
            y = d_8 * initialDistance / d_10 + initialY;
            z = initialZ;
        }

        d_6 = endCycle + 1 - i_4;
        velocityX = (i_1 - x) / d_6;
        velocityY = (i_2 - y) / d_6;
        speed = Math.sqrt(velocityY * velocityY + velocityX * velocityX);
        if (!inMotion)
            velocityZ = -speed * Math.tan(0.02454369D * angle);

        offsetZ = (i_3 - z - velocityZ * d_6) * 2.0D / (d_6 * d_6);
    }

    final void method615(int i_1) {
        inMotion = true;
        x += i_1 * velocityX;
        y += velocityY * i_1;
        z += offsetZ * 0.5D * i_1 * i_1 + i_1 * velocityZ;
        velocityZ += i_1 * offsetZ;
        rotX = (int) (Math.atan2(velocityX, velocityY) * 325.949D) + 1024 & 0x7ff;
        rotY = (int) (Math.atan2(velocityZ, speed) * 325.949D) & 0x7ff;
        if (animation != null) {
            time += i_1;

            while (true) {
                do {
                    do {
                        if (time <= animation.frameLengths[animationFrame])
                            return;

                        time -= animation.frameLengths[animationFrame];
                        ++animationFrame;
                    } while (animationFrame < animation.frameIds.length);

                    animationFrame -= animation.frameStep;
                } while (animationFrame >= 0 && animationFrame < animation.frameIds.length);

                animationFrame = 0;
            }
        }
    }

    @Override
    protected final Model getModel() {
        SpotAnim spotanim_2 = SpotAnim.staticMethod418(spotanim);
        Model model_3 = spotanim_2.method576(animationFrame);
        if (model_3 == null)
            return null;
        else {
            model_3.method650(rotY);
            return model_3;
        }
    }

}
