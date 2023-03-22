package structural_patterns.bridge.remotes;

import structural_patterns.bridge.devices.Device;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void on() {
        device.enable();
    }

    @Override
    public void off() {
        device.disable();
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}
