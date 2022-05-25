package class_10th.HW9;

import javax.swing.*;
import java.awt.*;

public class NameCard extends JFrame {

    private static final int WIDTH = 420;
    private static final int HEIGHT = 300;

    public NameCard() throws HeadlessException {
        setTitle("Name Card");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 300);
        setVisible(true);
        setLocation(450,250);

    }

    public void paint(Graphics graphics) {
        graphics.setColor(NameCardForm.selectedColor);
        graphics.drawRect(40,50,320,150);
      //  graphics.drawString(finalStr,290,120);

        graphics.fillRect(55,65,290,120);


        graphics.setColor(Color.black);
        graphics.drawString("Name:" + NameCardForm.selectedName,55,75);
        graphics.drawString("Phone:" + NameCardForm.selectedPhone1 + "-" + NameCardForm.selectedPhone2 + "-" + NameCardForm.selectedPhone3,55,90);
        graphics.drawString("Job:" + NameCardForm.selectedJob,55,105);
        graphics.drawString("Email:" + NameCardForm.selectedMail+NameCardForm.selectedMailDomain,55,120);

    }
}
