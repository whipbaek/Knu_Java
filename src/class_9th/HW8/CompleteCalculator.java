package class_9th.HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompleteCalculator extends JFrame {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 600;
    public static int calCnt=0; //2가 되면 항상 바로 계산 및, 1로 초기화
    public static boolean equalPossible = false;
    public static boolean dividePossible = true;
    public static boolean backActivate = false;
    public static boolean equalBackspace = false;
    public static String tempOperator;
    private String valStr= ""; //수식 저장용
    private String[] operand;
    private String backupString;

    private JButton j0 = new JButton("0");
    private JButton j1 = new JButton("1");
    private JButton j2 = new JButton("2");
    private JButton j3 = new JButton("3");
    private JButton j4 = new JButton("4");
    private JButton j5 = new JButton("5");
    private JButton j6 = new JButton("6");
    private JButton j7 = new JButton("7");
    private JButton j8 = new JButton("8");
    private JButton j9 = new JButton("9");

    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton multi = new JButton("*");
    private JButton divide = new JButton("/");
    private JButton equal = new JButton("=");

    private JTextField inputText = new JTextField();
    private JTextField resultText = new JTextField();

    private JButton clear = new JButton("C");
    private JButton back = new JButton("BACKSPACE");

    private JPanel jp1 = new JPanel();
    private JPanel jp2 = new JPanel();

    private double result = 0;

    public static void main(String[] args) {
        CompleteCalculator fullCalculator = new CompleteCalculator();
        fullCalculator.FullCalc();

    }

    public void FullCalc(){
        setTitle("FullCalculator");
        setLocation(800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);

        add(jp1);
        back.setPreferredSize(new Dimension(WIDTH,40));
        inputText.setPreferredSize(new Dimension(WIDTH-50,40));
        resultText.setPreferredSize(new Dimension(WIDTH-50,40));
        jp1.add(inputText);
        jp1.add(resultText);
        jp1.add(back);

        jp2.setLayout(new GridLayout(4,4));
        jp2.setPreferredSize(new Dimension(WIDTH,400));

        jp2.add(j7); jp2.add(j8); jp2.add(j9); jp2.add(multi);
        jp2.add(j4); jp2.add(j5); jp2.add(j6); jp2.add(divide);
        jp2.add(j1); jp2.add(j2); jp2.add(j3); jp2.add(clear);
        jp2.add(j0); jp2.add(plus); jp2.add(minus); jp2.add(equal);

        jp1.add(jp2);

        j0.addActionListener(new GetVal());
        j1.addActionListener(new GetVal());
        j2.addActionListener(new GetVal());
        j3.addActionListener(new GetVal());
        j4.addActionListener(new GetVal());
        j5.addActionListener(new GetVal());
        j6.addActionListener(new GetVal());
        j7.addActionListener(new GetVal());
        j8.addActionListener(new GetVal());
        j9.addActionListener(new GetVal());

        plus.addActionListener(new GetVal());
        minus.addActionListener(new GetVal());
        multi.addActionListener(new GetVal());
        divide.addActionListener(new GetVal());
        equal.addActionListener(new GetVal());

        clear.addActionListener(new GetVal());
        back.addActionListener(new GetVal());

    }

    class GetVal implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton)e.getSource();
            String val = btn.getText();

            if(calCnt == 0 || calCnt == 1) {
                switch (val) {
                    case "1":
                        valStr += ("1");
                        break;
                    case "2":
                        valStr += ("2");
                        break;
                    case "3":
                        valStr += ("3");
                        break;
                    case "4":
                        valStr += ("4");
                        break;
                    case "5":
                        valStr += ("5");
                        break;
                    case "6":
                        valStr += ("6");
                        break;
                    case "7":
                        valStr += ("7");
                        break;
                    case "8":
                        valStr += ("8");
                        break;
                    case "9":
                        valStr += ("9");
                        break;
                    case "0":
                        valStr += ("0");
                        break;
                    case "+":
                        valStr += ("+");
                        if(calCnt == 0)
                            tempOperator = "\\+";
                        calCnt++;
                        break;
                    case "-":
                        valStr += ("-");
                        if(calCnt == 0)
                            tempOperator = "-";
                        calCnt++;
                        break;
                    case "*":
                        valStr += ("*");
                        if(calCnt == 0)
                            tempOperator = "\\*";
                        calCnt++;
                        break;
                    case "/":
                        valStr += ("/");
                        if(calCnt == 0)
                            tempOperator = "/";
                        calCnt++;
                        break;
                    case "=":
                        valStr += ("=");
                        calCnt++;
                        break;
                    case "C":
                        valStr = "";
                        resultText.setText("");
                        calCnt=0;
                        break;
                    case "BACKSPACE":
                        if(backupString != null && backupString.length()>2){
                            valStr = backupString;
                            calCnt = 2;
                            backupString="";
                        }
                        Character ch = valStr.charAt(valStr.length()-1);
                        if(ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('=')){
                            calCnt--;
                        }
                        valStr = valStr.substring(0,valStr.length()-1);
                        break;
                }
                if(calCnt == 1){
                    operand = valStr.split(tempOperator);
                }
            }

            if(calCnt == 2){ //계산을 해야할 때

                if(val =="+" || val == "-" || val == "*" || val == "/") {
                    switch (tempOperator) {
                        case "\\+":
                            result = Double.parseDouble(operand[0]) + Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            valStr = result + val;
                            calCnt = 1;
                            break;
                        case "-":
                            result = Double.parseDouble(operand[0]) - Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            valStr = result + val;
                            calCnt = 1;
                            break;
                        case "\\*":
                            result = Double.parseDouble(operand[0]) * Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            valStr = result + val;
                            calCnt = 1;
                            break;
                        case "/":
                            if (Double.parseDouble(operand[1]) != 0) {
                                result = Double.parseDouble(operand[0]) / Double.parseDouble(operand[1]);
                                resultText.setText(Double.toString(result));
                                valStr = result + val;
                                calCnt = 1;
                                break;
                            } else {
                                calCnt=0;
                                result=0;
                                resultText.setText(valStr.substring(0, (valStr.length()-1)) +" Cant divide by 0");
                                valStr = "";
                                dividePossible = false;
                            }
                    }
                }
                else if(val == "="){ // "=" 일 때
                    equalPossible = true;
                    switch (tempOperator) {
                        case "\\+":
                            result = Double.parseDouble(operand[0]) + Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            calCnt = 1;
                            break;
                        case "-":
                            result = Double.parseDouble(operand[0]) - Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            calCnt = 1;
                            break;
                        case "\\*":
                            result = Double.parseDouble(operand[0]) * Double.parseDouble(operand[1]);
                            resultText.setText(Double.toString(result));
                            calCnt = 1;
                            break;
                        case "/":
                            if (Double.parseDouble(operand[1]) != 0) {
                                result = Double.parseDouble(operand[0]) / Double.parseDouble(operand[1]);
                                resultText.setText(Double.toString(result));
                                calCnt = 1;
                                break;
                            } else {
                                calCnt=0;
                                result=0;
                                resultText.setText(valStr.substring(0, (valStr.length()-1)) +" Cant divide by 0");
                                valStr = "";
                                dividePossible = false;
                            }
                    }

                }

                switch (val){
                    case "+": tempOperator = "\\+"; break;
                    case "-": tempOperator = "-"; break;
                    case "*": tempOperator = "\\*"; break;
                    case "/": tempOperator = "/"; break;
                    default:break;
                }




            }
            System.out.println("(final)valStr = " + valStr);

            inputText.setText(valStr);
            if(equalPossible) {
                equalPossible = false;
                backupString = valStr;
                valStr = String.valueOf(result);
                calCnt=0;
            }
            if(!dividePossible){
                valStr="";
                dividePossible=true;
            }
        }
    }



}
