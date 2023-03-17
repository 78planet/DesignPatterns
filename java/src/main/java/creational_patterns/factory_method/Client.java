package creational_patterns.factory_method;

import creational_patterns.factory_method.factory.Dialog;
import creational_patterns.factory_method.factory.HtmlDialog;
import creational_patterns.factory_method.factory.MacDialog;

public class Client {
    static Dialog dialog;
    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new MacDialog();
        } else {
            dialog = new HtmlDialog();
        }

        dialog.renderWindow();
    }
}
