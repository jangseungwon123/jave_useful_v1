package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    // private MyPaintFrame myPaintFrame;
    private MyPanel myPanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();

    }

    private void initData() {
        setTitle("집을 완성하자");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout() {

        add(myPanel);

    }

    //내부클래스
    static class MyPanel extends JPanel {

        @Override
        public void paint(Graphics g) {


            super.paint(g);

            //집몸통
            g.setColor(Color.BLUE);
            g.drawRect(250, 450, 500, 400);
            g.drawLine(750,850,1000,750);
            //지붕
            g.setColor(Color.RED);
            g.drawLine(250,450,500,200);
            g.drawLine(500,200,750,450);
            g.drawLine(500,200,1000,100);
            g.drawLine(750,450,1000,400);

            //문
            g.setColor(Color.BLACK);
            g.drawRect(425, 650, 150, 200);
            g.drawArc(425,735,25,25 ,90,360);
            //창문
            g.setColor(Color.BLACK);
            g.drawRect(463, 275, 75, 75);
            g.drawLine(500,275,500,350);
            //별
            g.setColor(Color.ORANGE);
            g.drawLine(100,50,70,130);
            g.drawLine(100,50,130,130);
            g.drawLine(55,80,145,80);
            g.drawLine(55,80,130,130);
            g.drawLine(145,80,70,130);

            g.drawLine(200,150,170,230);
            g.drawLine(200,150,230,230);
            g.drawLine(155,180,245,180);
            g.drawLine(155,180,230,230);
            g.drawLine(245,180,170,230);

            g.drawLine(180,70,150,150);
            g.drawLine(180,70,210,150);
            g.drawLine(135,100,225,100);
            g.drawLine(135,100,210,150);
            g.drawLine(225,100,150,150);







        }
    }  //end of static inner class

    //메인함수
    public static void main(String[] args) {

        new MyPaintFrame();
    }

}
