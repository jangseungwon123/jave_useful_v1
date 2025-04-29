package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEX1 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // 컴포넌트들을 그룹화 시킬 수 있다.
    // 즉 각각에 배치관리자를 추가로 설정해서 관리할 수 있다.
    private  JPanel panel1;
    private  JPanel panel2;
    private  JPanel panel3;

    public MyPanelEX1(){
       initData();
       setInitLayout();
    }

    private void initData(){
        setTitle("패널연습해보기");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



        panel1 =new JPanel();
        panel2 =new JPanel();
        panel3 =new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        button5 = new JButton("button5");
        button6 = new JButton("button6");

    }

    private  void setInitLayout(){
        setLayout(new GridLayout(3,1));
        // R G B
        // 0 0 0 검
        //255 255 255 흰
        panel1.setBackground(Color.RED);
        add(panel1);

        panel2.setBackground(Color.YELLOW);
        add(panel2);

        panel3.setBackground(Color.BLACK);
        add(panel3);

        //패널 1에 버튼1을 붙여보자.
        //pannel1에 아직 배치 관리자를 설정 안함 (기본 관리자가 셋팅됨)
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        panel1.add(button1);
        panel1.add(button2);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
        panel2.add(button3);
        panel2.add(button4);
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT,30,30));
        panel3.add(button5);
        panel3.add(button6);

    }

    //test코드 작성
    public static void main(String[] args) {
        new MyPanelEX1();


    }//end of main

}
