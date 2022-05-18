package class_9th.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 150;
    public static final int NUMBER_OF_DIGITS = 30;

    private JTextField ioField;
    private double result = 0.0;

    public static void main(String[] args) {
        Calculator aCacluator = new Calculator();
        aCacluator.setVisible(true);
    }

    public Calculator() throws HeadlessException {
        setTitle("Upgrade Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(1,4));
        ioField = new JTextField("Enter numbers here.", NUMBER_OF_DIGITS);
        ioField.setBackground(Color.WHITE);
        textPanel.add(ioField);
        add(textPanel, BorderLayout.NORTH);


        JPanel newPanel = new JPanel();
        newPanel.setBackground(Color.orange);
        add(newPanel);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.orange);
        btnPanel.setLayout(new GridLayout(1,4));

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        btnPanel.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        btnPanel.add(subtractButton);

        JButton resultButton = new JButton("=");
        resultButton.addActionListener(this);
        btnPanel.add(resultButton);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        btnPanel.add(resetButton);

        newPanel.add(btnPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            assumingCorrectNumberFormats(e);
        } catch (NumberFormatException e2) {
            ioField.setText("Error: Reenter Number.");
        }
    }

    public void assumingCorrectNumberFormats(ActionEvent e){
        String actionCommand = e.getActionCommand();

        switch (actionCommand){
            case "+" :
                result = result + Double.parseDouble(ioField.getText());
                ioField.setText(Double.toString(result));
                break;
            case "-":
                result = result - Double.parseDouble(ioField.getText());
                ioField.setText(Double.toString(result));
                break;
            case "=":
                ioField.setText(Double.toString(result));
                break;
            case "Reset":
                ioField.setText("0.0");
                break;
            default:
                ioField.setText("Unexpected error.");
                break;
        }
    }
}
