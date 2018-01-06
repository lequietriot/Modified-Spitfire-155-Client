# Modified-Spitfire-155-Client
This is nshusa's spitfire 155 OSRS client modified slightly to work with Alex's FileStore for the purpose of dumping sounds from the cache.

Credits:
* Nshusa - Spitfire 155 Client (https://github.com/nshusa/spitfire-155-client)
* Alex - FileStore Utility
* Me - Sounds 1, 2 and 3 Dumper classes
* Vincent - For the informative replies on Rune-Server to help me figure out how it works

How to use:
Sound1Dumper.java -
If you run this, the class writes a new file with the raw sound effect data (headerless audio).
* To listen to it, you'll need Audacity (https://www.audacityteam.org).
* Open Audacity and select File > Import > Raw Data...
* You can then convert/export the sound as an audio file of your choice (WAV/MP3/AIFF/More).

Note that the Sound1Dumper class only dumps File 0 in Index 4 as seen in the code:
> byte[] sfx1byte = sfxindex.getFile(0);

And writes the file to your project directory always as 0.dat as seen in the code:
> File file = new File("./0.dat/");

This could be altered to dump all the sounds at once using the variable i method (Would look like this):
> for (int i = 0; i < sfxindex.getValidArchivesCount(); i++) {

> byte[] sfx1byte = sfxindex.getFile(i);

And then don't forget to change this bit so it accounts for the new variable:
> File file = new File("./"+ i + ".dat/");


Sound2Dumper.java -
If you run this, the class writes a new file with the raw instrument sample data (headerless audio).
* To listen to it, open Audacity and select File > Import > Raw Data...
* You can then convert/export the sound as an audio file of your choice (WAV/MP3/AIFF/More).

Note that the Sound2Dumper class only dumps File 1 in Index 14 as seen in the code:
> soundbank.method159(1, null);

And writes the file to your project directory always as 0.dat as seen in the code (in the Sfx1 class):
> MusicNote method425(int[] ints_1) throws IOException {

> File file = new File("./0.dat/");

This could probably be modified in a similar nature to what I covered in the Sound1Dumper class.


Sound3Dumper.java - 
If you run this, the class prints out a bunch of information to the console.
Basically, the information tells you where to find specific sounds for specific instruments in the RuneScape Soundbanks.
It prints out something like "Sound2 (SampleID_NoteID): 2_5" for file 0 in Index 15, along with another bit.
This is telling you that File #2 in Index 14 is playing Note #5 (There are 127 notes on a complete piano roll, Note 5 = F-2 key/pitch)

Furthermore, you can change the byte to whichever instrument set you'd like to figure out in this line of code, simply change 0:
> byte[] sfx3byte = sfx3index.getFile(0);

The RS Soundbanks support up to 128 instruments per bank, starting with instrument 0 - Acoustic Grand Piano.
Following Bank 0 is Bank 1, which holds the various drum kits. 

More info here: https://github.com/lequietriot/OSRS-MIDI-Player/blob/master/OSRS%20Soundbank%20Structure.txt
And some here (RSHD): https://github.com/lequietriot/OSRS-MIDI-Player/blob/master/RSHD%20Soundbank%20Structure.txt
