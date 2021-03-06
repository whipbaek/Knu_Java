package class_9th;

import javax.swing.*;

public class FirstSwingDemo {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public static void main(String[] args) {
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(WIDTH, HEIGHT);
        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Click to end programs.");
        EndingListener buttonEar = new EndingListener(  );
        endButton.addActionListener(buttonEar);
        firstWindow.add(endButton);
        firstWindow.setVisible(true);
    }

}
