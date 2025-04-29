package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrameTest extends JFrame implements ActionListener {

    // 무지개 버튼 배열 선언
    private JButton[] buttons = {
            new JButton("빨"), new JButton("주"), new JButton("노"),
            new JButton("초"), new JButton("파"), new JButton("남"),
            new JButton("보")
    };

    private JPanel buttonPanle; // 버튼을 담아줄 패널 선언
    private JPanel colorPanel; // 버튼을 누를 때 바뀔 패널 선언


    public ColorChangeFrameTest() {
        initData();
        setInitLayout();
        //그리드
        addEventListener();

    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 패널 인스턴스 화
        buttonPanle = new JPanel();
        colorPanel = new JPanel();
    }

    private void setInitLayout() {

        setLayout(new GridLayout(2, 1));

        // 버튼 패널 추가
        add(buttonPanle);
        // 버튼 패널 안에 버튼들 add
        for (int i = 0; i < buttons.length; i++) {
            buttonPanle.add(buttons[i]);
        }
        // 색깔 표시 해줄 패널 add
        //colorPanel.setBackground(Color.BLUE);
        add(colorPanel);

        setVisible(true);
    }

    private void addEventListener() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedButton = ((JButton) e.getSource()).getText();
        System.out.println(selectedButton);

        if (selectedButton.equals("빨")) {
            colorPanel.setBackground(new Color(232, 9, 9));
        } else if (selectedButton.equals("주")) {
            colorPanel.setBackground(new Color(205, 99, 43, 255));
        } else if (selectedButton.equals("노")) {
            colorPanel.setBackground(new Color(236, 200, 101));
        } else if (selectedButton.equals("초")) {
            colorPanel.setBackground(new Color(66, 119, 31));
        } else if (selectedButton.equals("파")) {
            colorPanel.setBackground(new Color(20, 29, 131));
        } else if (selectedButton.equals("남")) {
            colorPanel.setBackground(new Color(20, 12, 69));
        } else if (selectedButton.equals("보")) {
            colorPanel.setBackground(new Color(81, 39, 135));
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrameTest();
    }
}
