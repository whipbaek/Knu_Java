package class_9th;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndingListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
