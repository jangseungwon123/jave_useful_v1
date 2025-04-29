package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame2  extends JFrame implements ActionListener {

   private JButton button1;
   private JButton button2;
   private JPanel panel;

   public ColorChangeFrame2(){
       initData();
       setInitLayout();
       addEeventListener();
   }
   private void initData(){
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       panel = new JPanel();
       button1 = new JButton("클릭1");
       button2 = new JButton("클릭2");
   };
   private void setInitLayout(){
       setLayout(new BorderLayout());
       panel.setBackground(Color.YELLOW);
       add(panel,BorderLayout.CENTER);
       add(button1,BorderLayout.NORTH);
       add(button2,BorderLayout.SOUTH);

       setVisible(true);
   };
   //이 메서드의 책임은 이벤트 리스너만을 등록 처리한다
   private void addEeventListener(){
       button1.addActionListener(this);//다향성
       button2.addActionListener(this);//다향성

   };



    @Override
    public void actionPerformed(ActionEvent e) {

        //JButton ->다운 캐스팅
        JButton selectdButton =(JButton)e.getSource();
        System.out.println(selectdButton);
        System.out.println(selectdButton.getText());

        //같은 객체의 주속밧을 가르키는 비교
        if(selectdButton == button1){
            panel.setBackground(Color.blue);
        }else if (selectdButton == button2) {
            panel.setBackground(Color.darkGray);
        }




        //도전과제
        //어떻게 button1이 눌러졌는지 button2가 눌러져쓴지 구분할까
    }

    public static void main(String[] args) {
        new ColorChangeFrame2();
    }
}
