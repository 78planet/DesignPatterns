package structural_patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        String mp3FileName = "good-morning.mp3";
        String wavFileName = "good-morning.wav";

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(mp3FileName);
        audioPlayer.play(wavFileName);
    }
}
