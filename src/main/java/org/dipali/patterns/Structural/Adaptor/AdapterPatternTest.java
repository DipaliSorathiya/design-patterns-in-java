package org.dipali.patterns.Structural.Adaptor;

public class AdapterPatternTest {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "aashiqui.mp3");
        player.play("vlc", "kabirsingh.vlc");
        player.play("mp4", "dangal.mp4");
    }
}
