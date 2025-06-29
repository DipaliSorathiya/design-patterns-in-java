package org.dipali.patterns.Structural.Adaptor;

public class VlcAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public VlcAdapter() {
        this.vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlcFile(fileName);
        } else {
            System.out.println("Invalid format for VLC Adapter");
        }
    }
}
