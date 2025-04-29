package _swing;

import javax.swing.*;
import java.awt.*;

/**
 * 배치관리자 - FlowLayout (컴포넌트들을 수평, 수직으로 배치)
 *
 */
public class MyComponents extends JFrame {
    // public class myComponents extends JFreame

    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;
    // private JButton button; // 버튼 삽입
    // private JLabel label; // 라벨 문구 넣어주기
    // private JTextField textField; 글자입력 칸 넣어주기
    // private JPasswordField passwordField; 패스워드 칸 넣어주기
    // private JCheckBox checkBox; , 체크란 넣어주기




    public MyComponents() {

        initData();
        setInitLayout();
        // public Mycomponets(){
        //initData();
        //setInitLayout(); }
    }

    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setTitle("컴포넌트 확인")
        //setSize(width : 800 height : 800)
        //setDafaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("JButton");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디입력하세요", 30);
        passwordField = new JPasswordField("비밀번호를입력하세요", 40);
        checkBox = new JCheckBox("동의");
        //button = new JButton("JButton");
        //label = new JLabel("글자를 띄우는 컴포넌트");
        //textField = new JTextField("아이디를 입력하세요 , 30);
        //passwordField = new JPasswordField("비밀번호를 입력하세요, 40);
        //cheakBox = new JCheckBox("동의")
    }

    private void setInitLayout() {
        // JFrame 의 배치 관리자를 결정해주는 메서드(레이아웃)
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        // 프레임에 붙여 넣기
        add(button);
        add(label);
        add(textField);
        add(passwordField);
        add(checkBox);
    }

    // 메인 함수 (테스트 코드 작성)
    public static void main(String[] args) {
        MyComponents myComponents = new MyComponents();

    } // end of main
}
