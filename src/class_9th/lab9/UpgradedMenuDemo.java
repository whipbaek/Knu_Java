package class_9th.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpgradedMenuDemo extends JFrame implements ActionListener {
    public static void main(String[] args) {
        UpgradedMenuDemo gui = new UpgradedMenuDemo();
        gui.setVisible(true);
    }

    private JPanel bluePanel;
    private JPanel whitePanel;
    private JPanel redPanel;

    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public UpgradedMenuDemo() {
        super("UpgradedMenuDemo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);

        add(bluePanel);
        add(whitePanel);
        add(redPanel);

        JMenu colorMenu = new JMenu("Add Colors");
        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(this);
        colorMenu.add(whiteChoice);

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        colorMenu.add(redChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);

        JMenu clearMenu = new JMenu("Clear");
        JMenuItem AllGray = new JMenuItem("All Gray");
        AllGray.addActionListener(new clear());
        clearMenu.add(AllGray);
        bar.add(clearMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnStr = e.getActionCommand();

        if (btnStr.equals("Blue")) bluePanel.setBackground(Color.BLUE);
        else if (btnStr.equals("White")) {
            whitePanel.setBackground(Color.WHITE);
        } else if (btnStr.equals("Red")) {
            redPanel.setBackground(Color.red);
        } else {
            System.err.println("Unexpected error");
        }
    }

    private class clear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            bluePanel.setBackground(Color.LIGHT_GRAY);
            whitePanel.setBackground(Color.LIGHT_GRAY);
            redPanel.setBackground(Color.LIGHT_GRAY);
        }
    }
}
