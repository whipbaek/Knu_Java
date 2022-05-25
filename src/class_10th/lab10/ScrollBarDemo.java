package class_10th.lab10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollBarDemo extends JFrame implements ActionListener {
	// Define the rest of constants for ScrollBarDemo.

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	public static final int LINES = 25;
	public static final int CHAR_PER_LINE = 30;

	public static final String memo1BtnLabel = "Save Memo 1";
	public static final String memo2BtnLabel = "Save Memo 2";
	public static final String clearBtnLabel = "Clear";
	public static final String get1BtnLabel = "Get Memo 1";
	public static final String get2BtnLabel = "Get Memo 1";

	private JTextArea memoDisplay;
	private String memo1;
	private String memo2;


	@Override
	public void actionPerformed(ActionEvent e) {
		// Complete this method.
		String actionCmd = e.getActionCommand();
		switch (actionCmd) {
			case "Save Memo 1":
				memo1 = memoDisplay.getText(); break;
			case "Save Memo 2":
				memo2 = memoDisplay.getText(); break;
			case "Clear":
				memoDisplay.setText(""); break;
			case "Get Memo 1":
				memoDisplay.setText(memo1); break;
			case "Get Memo 2":
				memoDisplay.setText(memo2); break;
			default:
				memoDisplay.setText("Error in memo interface"); break;
		}
	}

	public ScrollBarDemo() {
		// Complete this method.
		super("Scroll Bars Demo");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());

		JButton memo1Btn = new JButton(memo1BtnLabel);
		memo1Btn.addActionListener(this);
		btnPanel.add(memo1Btn);

		JButton memo2Btn = new JButton(memo2BtnLabel);
		memo2Btn.addActionListener(this);
		btnPanel.add(memo2Btn);

		JButton clearBtn = new JButton(clearBtnLabel);
		clearBtn.addActionListener(this);
		btnPanel.add(clearBtn);

		JButton get1Btn = new JButton(get1BtnLabel);
		get1Btn.addActionListener(this);
		btnPanel.add(get1Btn);

		JButton get2Btn = new JButton(get2BtnLabel);
		get2Btn.addActionListener(this);
		btnPanel.add(get2Btn);

		add(btnPanel, BorderLayout.SOUTH);

		JPanel textPanel = new JPanel();
		textPanel.setBackground(Color.ORANGE);

		memoDisplay = new JTextArea(LINES, CHAR_PER_LINE);
		memoDisplay.setBackground(Color.WHITE);

		JScrollPane scrolledText = new JScrollPane(memoDisplay);
		scrolledText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		textPanel.add(scrolledText);
		add(textPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrollBarDemo gui = new ScrollBarDemo();
		gui.setVisible(true);
	}
}