package class_9th.HW8;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tempCalc extends JFrame {

    public tempCalc(String title) {

        //this없어도됨 //title설정
        setTitle(title);
        //size설정(width,height)
        setSize(230, 400);
        //위치 설정(x,y)
        setLocation(800, 300);
        //종료관리(보통 EXIT_ON_CLOSE를 사용, 상수3)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //패널 선언
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        //jp1 레이아웃설정
        this.add(jp1);
        jp1.setLayout(new FlowLayout());

        //jp2 레이아웃
        jp2.setLayout(new GridLayout(4,4));
        jp2.setPreferredSize(new Dimension(220,220));

        //jp2 1번줄
        JButton b1 = new JButton("1");
        jp2.add(b1);

        JButton b2 = new JButton("2");
        jp2.add(b2);

        JButton b3 = new JButton("3");
        jp2.add(b3);

        JButton bminer = new JButton("-");
        jp2.add(bminer);

        //jp2 2번줄
        JButton b4 = new JButton("4");
        jp2.add(b4);

        JButton b5 = new JButton("5");
        jp2.add(b5);

        JButton b6 = new JButton("6");
        jp2.add(b6);

        JButton bplus = new JButton("+");
        jp2.add(bplus);

        //jp2 3번줄
        JButton b7 = new JButton("7");
        jp2.add(b7);

        JButton b8 = new JButton("8");
        jp2.add(b8);

        JButton b9 = new JButton("9");
        jp2.add(b9);

        JButton bgob = new JButton("*");
        jp2.add(bgob);

        //jp2 4번줄
        JButton b0 = new JButton("0");
        jp2.add(b0);

        JButton bdot = new JButton(".");
        jp2.add(bdot);

        JButton beq = new JButton("=");
        jp2.add(beq);

        JButton bna = new JButton("/");
        jp2.add(bna);

        //jp3 레이아웃
        jp3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jp3.setPreferredSize(new Dimension(220,100));

        //jp3 내용
        JLabel text1 = new JLabel("만든이 : ㅁㄴㅇ");
        JLabel text2 = new JLabel("eMail : ㅁㄴㅇ@naver.com");

        jp3.add(text1);
        jp3.add(text2);

        //clear 버튼 선언
        JButton Clear = new JButton("Clear");
        //버튼 사이즈 설정
        Clear.setPreferredSize(new Dimension(220,30));

        //전체내용
        JLabel idlbl = new JLabel("Swing으로 구현한 계산기");
        jp1.add(idlbl);
        JTextField idtf = new JTextField(24);
        jp1.add(idtf);
        jp1.add(jp2);
        jp1.add(Clear);
        jp1.add(jp3);


        //창이 계속보이게 함
        this.setVisible(true);

    }

    public static void main(String[] args) {
        //인수로 넣음
        new tempCalc("계산기");

    }

}