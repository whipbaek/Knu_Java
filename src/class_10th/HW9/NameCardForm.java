package class_10th.HW9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameCardForm extends JFrame implements ActionListener {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 500;
    private Color sampleColor = Color.LIGHT_GRAY;

    private JLabel NameCardFormLabel = new JLabel("Name Card Form");
    private JLabel NameLabel = new JLabel("Name");
    private JLabel PhoneLabel = new JLabel("Phone");
    private JLabel JobLabel = new JLabel("Job");
    private JLabel EmailLabel = new JLabel("Email");
    private JLabel ColorLabel = new JLabel("Color");
    private JButton chooseBtn = new JButton("Choose");
    private JTextField NameText = new JTextField(15);

    private JTextField phone1TextField = new JTextField(5);
    private JTextField phone2TextField = new JTextField(5);
    private JTextField phone3TextField = new JTextField(5);

    private GridBagLayout gbl = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();

    public void make(JComponent c, int x, int y, int w, int h) {

        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        gbl.setConstraints(c, gbc);
    }


    public NameCardForm() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Make your own form");
       // sampleColor = JColorChooser.showDialog(this, "JColorChooser", sampleColor);
        setSize(WIDTH, HEIGHT);

        setLayout(gbl);
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        make(NameLabel, 0, 0, 1, 1);
        make(NameText, 1, 0, 3, 1);

        make(PhoneLabel, 0,1,1,1 );
        make(phone1TextField, 1,1,1,1);
        make(phone2TextField, 2,1,1,1);
        make(phone3TextField, 3,1,1,1);

        make(JobLabel, 0,2,1,1 );
        make(EmailLabel, 0,3,1,1 );
        make(ColorLabel, 0,4,1,1 );

        add(NameLabel);
        add(NameText);

        add(PhoneLabel);
        add(phone1TextField);
        add(phone2TextField);
        add(phone3TextField);

        add(JobLabel);
        add(EmailLabel);
        add(ColorLabel);

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

    public static void main(String[] args) {
        NameCardForm nameCardForm = new NameCardForm();
        nameCardForm.setVisible(true);
    }
}
