package class_9th;

import java.awt.*;

public class DemoColoredWindow {
    public static void main(String[] args) {
        ColoredWindow w1 = new ColoredWindow();
        w1.setVisible(true);

        ColoredWindow w2 = new ColoredWindow(Color.GRAY);
        w2.setVisible(true);
    }
}
