package class_9th.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RainbowDemo extends JFrame implements ActionListener {

    public static void main(String[] args) {
        RainbowDemo gui = new RainbowDemo();
        gui.setVisible(true);
    }

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    private JPanel redPanel;
    private JPanel OrangePanel;
    private JPanel YellowPanel;
    private JPanel GreenPanel;
    private JPanel BluePanel;
    private JPanel CyanPanel;
    private JPanel MagentaPanel;

    public RainbowDemo() {
        super("Rainbow Panel Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,7));

        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);

        OrangePanel = new JPanel();
        OrangePanel.setBackground(Color.LIGHT_GRAY);

        YellowPanel = new JPanel();
        YellowPanel.setBackground(Color.LIGHT_GRAY);

        GreenPanel = new JPanel();
        GreenPanel.setBackground(Color.LIGHT_GRAY);

        BluePanel = new JPanel();
        BluePanel.setBackground(Color.LIGHT_GRAY);

        CyanPanel = new JPanel();
        CyanPanel.setBackground(Color.LIGHT_GRAY);

        MagentaPanel = new JPanel();
        MagentaPanel.setBackground(Color.LIGHT_GRAY);

        biggerPanel.add(redPanel);
        biggerPanel.add(OrangePanel);
        biggerPanel.add(YellowPanel);
        biggerPanel.add(GreenPanel);
        biggerPanel.add(BluePanel);
        biggerPanel.add(CyanPanel);
        biggerPanel.add(MagentaPanel);

        add(biggerPanel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.LIGHT_GRAY);
        btnPanel.setLayout(new FlowLayout());

        JButton redBtn = new JButton("Red");
        redBtn.setBackground(Color.LIGHT_GRAY);
        redBtn.addActionListener(this);
        btnPanel.add(redBtn);

        JButton OrangeBtn = new JButton("Orange");
        OrangeBtn.setBackground(Color.LIGHT_GRAY);
        OrangeBtn.addActionListener(this);
        btnPanel.add(OrangeBtn);

        JButton YellowBtn = new JButton("Yellow");
        YellowBtn.setBackground(Color.LIGHT_GRAY);
        YellowBtn.addActionListener(this);
        btnPanel.add(YellowBtn);

        JButton GreenBtn = new JButton("Green");
        GreenBtn.setBackground(Color.LIGHT_GRAY);
        GreenBtn.addActionListener(this);
        btnPanel.add(GreenBtn);

        JButton BlueBtn = new JButton("Blue");
        BlueBtn.setBackground(Color.LIGHT_GRAY);
        BlueBtn.addActionListener(this);
        btnPanel.add(BlueBtn);

        JButton CyanBtn = new JButton("Navy");
        CyanBtn.setBackground(Color.LIGHT_GRAY);
        CyanBtn.addActionListener(this);
        btnPanel.add(CyanBtn);

        JButton MagentaBtn = new JButton("Purple");
        MagentaBtn.setBackground(Color.LIGHT_GRAY);
        MagentaBtn.addActionListener(this);
        btnPanel.add(MagentaBtn);

        add(btnPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnStr = e.getActionCommand();

        switch (btnStr){
            case "Red" : redPanel.setBackground(Color.RED); break;
            case "Orange" : OrangePanel.setBackground(Color.ORANGE); break;
            case "Yellow" : YellowPanel.setBackground(Color.YELLOW); break;
            case "Green" : GreenPanel.setBackground(Color.GREEN); break;
            case "Blue" : BluePanel.setBackground(Color.BLUE); break;
            case "Navy" : CyanPanel.setBackground(Color.CYAN); break;
            case "Purple" : MagentaPanel.setBackground(Color.magenta); break;
            default: System.err.println("Unexpected error."); break;
        }
    }
}
