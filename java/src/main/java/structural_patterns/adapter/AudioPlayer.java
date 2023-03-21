package structural_patterns.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        String fileType = filename.substring(filename.indexOf(".") + 1);

        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing Mp3 file: " + filename);
        } else if (fileType.equalsIgnoreCase("wav")) {
            MediaAdapter mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(filename);
        } else {
            System.out.println("Invalid media type. Only MP3 and WAV files are supported.");
        }
    }
}
