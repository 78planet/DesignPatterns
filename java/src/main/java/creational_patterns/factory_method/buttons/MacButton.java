package creational_patterns.factory_method.buttons;

import javax.swing.*;

public class MacButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        // Create a new JFrame
        frame.setSize(300, 200);

        // Create a new JPanel with a vertical layout manager
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create a new JLabel with "Hi" text
        JLabel label = new JLabel("Hi");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(label);

        onClick();
    }

    @Override
    public void onClick() {
        // Create a new JButton with "Hello World" text
        button = new JButton("ok");
        button.setAlignmentX(JButton.CENTER_ALIGNMENT);

        // Add an ActionListener to the button that exits the application when clicked
        button.addActionListener(e -> System.exit(0));

        // Add the button to the JPanel
        panel.add(button);

        // Add the JPanel to the JFrame
        frame.getContentPane().add(panel);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
