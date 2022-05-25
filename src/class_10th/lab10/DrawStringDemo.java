package class_10th.lab10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.Font;
/***
 * You cannot release or distribute 
 * this code without instructor's permission.
 * COMP217: Java Programming
 * Instructor: Prof. Suh, Young-Kyoon
 * Class DrawStringDemo
 * @author yksuh
 */
public class DrawStringDemo extends JFrame 
							implements ActionListener {
	public static final int WIDTH = 350;
	public static final int HEIGHT = 200;
	
	public static final int X_START = 20;
	public static final int Y_START = 100;
	
	public static final int POINT_SIZE = 24;
	
	private String theText = "Push the button.";
	private Color penColor = Color.BLACK;
	private Font fontObj = new Font("SanSerif", Font.PLAIN, POINT_SIZE);
	
	public static void main(String[] args) {
		DrawStringDemo gui = new DrawStringDemo();
		gui.setVisible(true);
	}
	
	public DrawStringDemo() {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("drawString Demo");
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.GRAY);
		btnPanel.setLayout(new BorderLayout());
		
		JButton theBtn = new JButton("The Button");
		theBtn.addActionListener(this);
		
		btnPanel.add(theBtn, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(fontObj);
		g.setColor(penColor);
		
		g.drawString(theText, X_START, Y_START);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		penColor = Color.RED;
		
		fontObj = new Font("Serif", 
				Font.BOLD | Font.ITALIC, POINT_SIZE);
		theText = "Thank you. I needed that.";
		
		repaint();
	}
}
