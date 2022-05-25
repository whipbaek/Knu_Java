package class_10th.lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class IconDemo extends JFrame implements ActionListener{

	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	public static final int TEXT_FIELD_SIZE = 30;
	public static final String srcPath = "src";
	public static final String packageName ="lab10";

	private JTextField messsage;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IconDemo iconGui = new IconDemo();
		iconGui.setVisible(true);
	}
	
	public IconDemo() {
		// Implement
		super("Icon Demo");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());

		String currentProjPath = "";
		try {
			currentProjPath = new File(".").getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ImageIcon dukeIcon = new ImageIcon("C:\\Users\\whipbaek\\Knu_Java\\src\\class_10th\\lab10\\duke_waving.gif");
		JLabel dukeLabel = new JLabel("Mood check");
		dukeLabel.setIcon(dukeIcon);
		add(dukeLabel, BorderLayout.NORTH);

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());

		JButton happyBtn = new JButton("Happy");
		ImageIcon happyIcon = new ImageIcon("C:\\Users\\whipbaek\\Knu_Java\\src\\class_10th\\lab10\\smile.jpeg");
		happyBtn.setIcon(happyIcon);
		happyBtn.addActionListener(this);
		btnPanel.add(happyBtn);

		JButton sadBtn = new JButton("Sad");
		ImageIcon sadIcon = new ImageIcon("C:\\Users\\whipbaek\\Knu_Java\\src\\class_10th\\lab10\\sad.gif");
		sadBtn.setIcon(sadIcon);
		sadBtn.addActionListener(this);
		btnPanel.add(sadBtn);
		add(btnPanel, BorderLayout.SOUTH);

		messsage = new JTextField(TEXT_FIELD_SIZE);
		add(messsage, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		if (actionCmd.equals("Happy")) {
			messsage.setText("Smile and " + "the world smiles with you !");
		} else if (actionCmd.equals("Sad")) {
			messsage.setText("Cheer up. It can't be that bad");
		} else{
			messsage.setText("Unexpected Error.");
		}
	}
}
