package class_10th.HW9;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private JButton assBtn = new JButton("Assign");

    private JTextField NameText = new JTextField(15);

    private JTextField phone1TextField = new JTextField(5);
    private JTextField phone2TextField = new JTextField(5);
    private JTextField phone3TextField = new JTextField(5);

    private GridBagLayout gbl = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();


    private String[] Jobs = {
            "Developer,0full-stack",
            "Developer, back-end",
            "Developer, front-end",
            "Developer, mobile",
            "DevOps specialist",
            "System administrator",
            "Database administrator",
            "Data scientist",
            "machine learning specialist",
            "Student",
            "Academic researcher",
            "Engineer, data",
            "Developer, QA or test",
            "Product manager"
    };
    private JList jList = new JList<>(Jobs);
    private JScrollPane scrollPane = new JScrollPane(jList);

    //Mail part
    private String[] mails = {
            "gmail.com",
            "naver.com",
            "hanmail.com",
            "yahoo.com",
            "knu.ac.kr"
    };
    private JLabel mailLabel = new JLabel("@");
    private JComboBox<String> jComboBox = new JComboBox<>(mails);
    private JTextField mailTextField = new JTextField(7);

    private JTextField colorTextField = new JTextField(8);

    public static String selectedName="";
    public static String selectedPhone1="";
    public static String selectedPhone2="";
    public static String selectedPhone3="";
    public static String selectedJob="";
    public static String selectedMail = "";
    public static String selectedMailDomain ="";
    public static Color selectedColor=null;

    public NameCardForm() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Make your own form");
       // sampleColor = JColorChooser.showDialog(this, "JColorChooser", sampleColor);
        setSize(WIDTH, HEIGHT);

        setLayout(gbl);
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        NameCardFormLabel.setSize(10,20);
        make(NameCardFormLabel,1,0,3,1 );

        make(NameLabel, 0, 1, 1, 1);
        make(NameText, 1, 1, 3, 1);

        make(PhoneLabel, 0,2,1,1 );
        make(phone1TextField, 1,2,1,1);
        make(phone2TextField, 2,2,1,1);
        make(phone3TextField, 3,2,1,1);

        make(JobLabel, 0,3,1,1 );
        make(scrollPane, 1, 3, 3, 1);

        make(EmailLabel, 0,4,1,1 );
        make(mailLabel, 2,4,1,1);
        make(jComboBox, 3, 4, 1, 1);
        make(mailTextField, 1, 4, 1, 1);

        make(ColorLabel, 0,5,1,1 );
        make(colorTextField,1,5,2,1);
        make(chooseBtn, 3, 5, 3, 1);
        make(assBtn, 1,6,2,1);

        add(NameCardFormLabel);
        add(NameLabel);
        add(NameText);

        add(PhoneLabel);
        add(phone1TextField);
        add(phone2TextField);
        add(phone3TextField);

        add(JobLabel);
        add(scrollPane);

        add(EmailLabel);
        add(mailLabel);
        add(jComboBox);
        add(mailTextField);

        add(ColorLabel);
        add(colorTextField);
        add(chooseBtn);
        chooseBtn.addActionListener(this);
        jList.addListSelectionListener(new JListHandler());

        add(assBtn);
        assBtn.addActionListener(new AssignEvent());
        setLocation(400,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnCmd = e.getActionCommand();
        if(btnCmd != null && btnCmd.equals("Choose")){
            sampleColor = JColorChooser.showDialog(this, "JColorChooser", sampleColor);
            if(sampleColor != null) { //if a color was chosen
                System.out.println("sampleColor = " + sampleColor);
                colorTextField.setBackground(sampleColor);
                selectedColor = sampleColor;
            }
        } else {
            System.out.println("Unanticipated Error");
        }

    }

    public void make(JComponent c, int x, int y, int w, int h) {

        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;

        gbl.setConstraints(c, gbc);
    }

    private class JListHandler implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            selectedJob = Jobs[jList.getSelectedIndex()];
        }
    }

    private class AssignEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String btnCmd = e.getActionCommand();
            if(btnCmd != null && btnCmd.equals("Assign")){
                //창을 새로 띄워야함.

                selectedMailDomain = jComboBox.getItemAt(jComboBox.getSelectedIndex());
                selectedName = NameText.getText();
                selectedMail = mailTextField.getText() +"@";
                selectedPhone1= phone1TextField.getText();
                selectedPhone2= phone2TextField.getText();
                selectedPhone3= phone3TextField.getText();

                System.out.println("Name :" + selectedName);
                System.out.println("Phone : " + selectedPhone1 + "-" + selectedPhone2 + "-" + selectedPhone3);
                System.out.println("Job : " + selectedJob);
                System.out.println("Email : " + selectedMail + selectedMailDomain);
                System.out.println("selected color : " + selectedColor);
                new NameCard();

            } else {
                System.out.println("Unanticipated Error");
            }
        }
    }




    public static void main(String[] args) {
        NameCardForm nameCardForm = new NameCardForm();
        nameCardForm.setVisible(true);
    }
}
