package structural_patterns.bridge.devices;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    void setChannel(int channel);
    int getChannel();
    void setVolume(int volume);
    int getVolume();
    String getName();
    default void printStatus() {
        System.out.printf("current enable : %b\n", isEnabled());
        System.out.printf("current channel : %d\n", getChannel());
        System.out.printf("current volume : %d\n", getVolume());
    }
}
