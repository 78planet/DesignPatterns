package structural_patterns.adapter;

public class WAVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playWAV(String filename) {
        System.out.println("Playing WAV file: " + filename);
    }
}
