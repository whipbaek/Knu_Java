package class_10th;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserDemo extends JFrame implements ActionListener {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    private Color sampleColor = Color.LIGHT_GRAY;
    public static void main(String[] args) {
        JColorChooserDemo jColorChooserDemo = new JColorChooserDemo();
        jColorChooserDemo.setVisible(true);
    }

    public JColorChooserDemo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(sampleColor);
        setLayout(new BorderLayout());
        setTitle("JColorChooser Demo");
        setSize(WIDTH, HEIGHT);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.WHITE);
        btnPanel.setLayout(new FlowLayout());
        JButton chooseBtn = new JButton("Choose a Color");
        chooseBtn.addActionListener(this);
        btnPanel.add(chooseBtn);
        add(btnPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnCmd = e.getActionCommand();
        if(btnCmd != null && btnCmd.equals("Choose a Color")){
            sampleColor = JColorChooser.showDialog(this, "JColorChooser", sampleColor);
            if(sampleColor != null) //if a color was chosen
                getContentPane().setBackground(sampleColor);
        } else {
            System.out.println("Unanticipated Error");
        }

    }
}
