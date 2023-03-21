package structural_patterns.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedMediaPlayer = new WAVPlayer();
        }
    }

    @Override
    public void play(String filename) {
        String fileType = filename.substring(filename.indexOf(".") + 1);
        if (fileType.equalsIgnoreCase("wav")) {
            advancedMediaPlayer.playWAV(filename);
        }
    }
}
