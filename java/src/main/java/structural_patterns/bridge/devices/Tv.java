package structural_patterns.bridge.devices;

public class Tv implements Device {
    private boolean isEnabled = false;
    private int channel = 1;
    private int volume = 1;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        System.out.println("Tv turn on!");
        isEnabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Tv turn off!");
        isEnabled = false;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return "Tv";
    }
}
