package structural_patterns.bridge.remotes;

public interface Remote {
    void on();
    void off();
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();
}
