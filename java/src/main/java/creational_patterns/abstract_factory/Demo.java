package creational_patterns.abstract_factory;

import java.util.Locale;

import creational_patterns.abstract_factory.app.Application;
import creational_patterns.abstract_factory.fatories.GUIFactory;
import creational_patterns.abstract_factory.fatories.MacOsFactory;
import creational_patterns.abstract_factory.fatories.WindowFactory;

public class Demo {

    // 앱은 현재 설정에 따라 팩토리 유형을 선택한 후 팩토리를 런타임 때 생선한다.
    private static Application configurationApplication() {
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (osName.contains("mac")) {
            guiFactory = new MacOsFactory();
        } else {
            guiFactory = new WindowFactory();
        }

        return new Application(guiFactory);
    }

    public static void main(String[] args) {
        Application application = configurationApplication();
        application.paint();
    }
}
