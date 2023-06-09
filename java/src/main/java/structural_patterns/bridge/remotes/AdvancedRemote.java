package structural_patterns.bridge.remotes;

import structural_patterns.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute() {
        System.out.println("set mute!");
        device.setVolume(0);
    }
}
