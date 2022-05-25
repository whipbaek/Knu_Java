package class_10th.lab10;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class WindowListenerDemo
 * @author yksuh
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowListenerDemo extends JFrame{

	public static final int WIDTH  = 300;// for main window
	public static final int HEIGHT = 200;// for main window
	
	public static final int SMALL_WIDTH  = 200;// for confirm window
	public static final int SMALL_HEIGHT = 100;// for confirm window
	
	public static final String YES = "Yes";
	public static final String NO = "No";
	
	// An inner class
	private class CheckOnExit implements WindowListener{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
			ConfirmWindow checkers = new ConfirmWindow();
			checkers.setVisible(true);
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
	}// End of inner class CheckOnExit
	
//	private class CheckOnExit extends WindowAdapter{
//		public void windowClosing(WindowEvent e) {
//			ConfirmWindow checkers = new ConfirmWindow();
//			checkers.setVisible(true);
//		}
//	}// End of inner class CheckOnExit
	
	// An inner class
	private class ConfirmWindow extends JFrame 
		implements ActionListener{
		public ConfirmWindow() {
			setSize(SMALL_WIDTH, SMALL_HEIGHT);
			getContentPane().setBackground(Color.YELLOW);
			setLayout(new BorderLayout());
			JLabel confirmLabel = new JLabel("Are you sure you want to exit?");
			add(confirmLabel, BorderLayout.CENTER);
			
			JPanel btnPanel = new JPanel();
			btnPanel.setBackground(Color.ORANGE);
			btnPanel.setLayout(new FlowLayout());
			
			JButton exitBtn = new JButton(YES);
			exitBtn.addActionListener(this);
			btnPanel.add(exitBtn);
			
			JButton cancelBtn = new JButton(NO);
			cancelBtn.addActionListener(this);
			btnPanel.add(cancelBtn);
			
			add(btnPanel, BorderLayout.SOUTH);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String actionCmd = e.getActionCommand();
			if(actionCmd.equals(YES)) {
				System.exit(0);
			}else if(actionCmd.equals(NO)) {
				dispose();// destroys only the ConfirmWindow
			}else
				System.out.println("Unexpected Error"
						+ " in Confirm Window");
		}
	} // end of ConfirmWindow

	public WindowListenerDemo() {
		setSize(WIDTH, HEIGHT);
		setTitle("Window Listener Demonstration");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new CheckOnExit());
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		JLabel aLabel = new JLabel("I like to be sure "
				+ "you are sincere.");
		add(aLabel);
	}
	
	public static void main(String[] args) {
		WindowListenerDemo demoWindow = new WindowListenerDemo();
		demoWindow.setVisible(true);
	}
}
