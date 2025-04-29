package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {
    //public class MuPaintFrame ectend JFrame{
    //변수,생성자,메서드,내부클래스

    //패널
    //private JPanel panel; <-이패널도 클래스이기 때문에 내가 정의한 클래스에 상속받을 수 있다.
    private MyDrawPanel drawPanel;
    // private myDrawPanel drawPanel;


    public MyPaintFrame() {
        initData();
        setinitLayout();
        //public myPaintFrame(){
        //initData();
        //setinintLayout();}
    }

    private void initData() {
        setTitle("내부클래스 JPanel 상속처리");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //private void initData(){
        //setTitle("내부클래스 JPanel 상속처리 ")
        //setSize(width 800 , height 800);
        //setDafaultCliseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);

        drawPanel = new MyDrawPanel();
        //drawPanel = new MyDrawPanel();

    }

    private void setinitLayout() {

        add(drawPanel);

    }

    //우리가 정의한 정적 내부 클래스
    static class MyDrawPanel extends JPanel {

        /// paint 철자 확인
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50, 50, 100, 50);
            g.drawLine(200, 100, 200, 350);
            g.drawLine(300, 300, 350, 500);
            g.drawString("***", 500, 500);
            g.drawString("(ꔷ̥̑.̮ꔷ̥̑)***", 530, 530);
        }

    } // end of inner class

    //메인함수
    public static void main(String[] args) {

        new MyPaintFrame();
    }
}
