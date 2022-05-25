package class_10th.lab10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JColorChooser;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class JColorChooserDemo
 * @author yksuh
 */
public class JColorChooserDemo extends JFrame
							implements ActionListener{

	public static final int WIDTH = 400;
	public static final int HEIGHT = 200;
	
	private Color sampleColor = Color.LIGHT_GRAY;
	
	public static void main(String[] args) {
		JColorChooserDemo gui = new JColorChooserDemo();
		gui.setVisible(true);
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
		String chooseColorCmd = "Choose a Color";
		if(btnCmd != null && btnCmd.equals(chooseColorCmd)) {
			sampleColor = 
					JColorChooser.showDialog(this, 
							"JColorChooser", sampleColor);
			if(sampleColor != null)// If a color was chosen
				getContentPane().setBackground(sampleColor);
		}else {
			System.out.println("Unanticipated Error");
		}	
	}
}
