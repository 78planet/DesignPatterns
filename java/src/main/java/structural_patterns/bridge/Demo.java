package structural_patterns.bridge;

import structural_patterns.bridge.devices.Device;
import structural_patterns.bridge.devices.Radio;
import structural_patterns.bridge.devices.Tv;
import structural_patterns.bridge.remotes.AdvancedRemote;
import structural_patterns.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        print(new Radio());
        print(new Tv());
    }

    static void print(Device device) {
        System.out.println("Device: " + device.getName());
        System.out.println("--------------BasicRemote----------------");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.on();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.channelDown();
        basicRemote.volumeUp();
        device.printStatus();
        basicRemote.off();
        System.out.println("------------------------------");
        System.out.println("--------------AdvancedRemote----------------");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.on();
        advancedRemote.channelUp();
        advancedRemote.channelUp();
        advancedRemote.channelUp();
        advancedRemote.channelDown();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        device.printStatus();
        advancedRemote.off();
        System.out.println("------------------------------\n");

    }
}
