package _swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    //멤버변수
    JButton[] buttons;
    String[] layout = {BorderLayout.WEST, BorderLayout.EAST, BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH};

    //생성자
    public BorderLayoutEx() {
        setTitle("borderLayout연습");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        serInitLayout();

    }

    //메서드
    private void initData() {
        //for문
        buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
//        buttons = new JButton[5];
//        buttons[0] = new JButton("button1");
//        buttons[1] = new JButton("button2");
//        buttons[2] = new JButton("button3");
//        buttons[3] = new JButton("button4");
//        buttons[4] = new JButton("button5");
    }

    private void serInitLayout() {
        //배치관리자 (보더레이아웃)
        //BoderLayout은 컴퍼넌트들을 동서남북가운데 로 배치 시켜주는 레이아웃
        setLayout(new BorderLayout());

        //프레임(패널)
        //우리가 생성한 JButton객체를 프레임에 붙이다
        //
        //for문
        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], layout[i]);
        }

//        add(buttons[0], BorderLayout.WEST);
//        add(buttons[1], BorderLayout.EAST);
//        add(buttons[2], BorderLayout.CENTER);
//        add(buttons[3], BorderLayout.NORTH);
//        add(buttons[4], BorderLayout.SOUTH);

    }
} // end of class
