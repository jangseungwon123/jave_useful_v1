package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel1;
    private MyImagePanel myImagePanel2;
    private MyImagePanel myImagePanel3;

    public MyImageFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("이미지 넣어 보는 연습");
        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myImagePanel1 = new MyImagePanel("image1.png");
        myImagePanel2 = new MyImagePanel("image2_rm.png","image3_rm.png");
        myImagePanel3 = new MyImagePanel("image3_rm.png");
  }

    private void setInitLayout() {
        setLayout(new GridLayout(3,1));
        add(myImagePanel1);
        add(myImagePanel2);
        add(myImagePanel3);

    }


    //정적 내부 클래스 생성
    static class MyImagePanel extends JPanel {

        //내부 클래스의 맴버 변수 선언;
        private Image image1;
        private Image image2;
        private Image image3;

        public MyImagePanel(String imageName){
            //ImageIcon 데이터 타입을 -> .getImage()해서 메서드를 호출해서 형 변환
            //ImageIcon(파일명)<------기준은  루트폴더 java_useful 아래를 확인한다.
            image1 = new ImageIcon(imageName).getImage();
            //image1 = new ImageIcon("image5_rm.png").getImage();
            //image2 = new ImageIcon(imageName1).getImage();
            //image3 = new ImageIcon("image3_rm.png").getImage();
        }

        public MyImagePanel(String imageName,String imageName1){
            //ImageIcon 데이터 타입을 -> .getImage()해서 메서드를 호출해서 형 변환
            //ImageIcon(파일명)<------기준은  루트폴더 java_useful 아래를 확인한다.
            image1 = new ImageIcon(imageName).getImage();
            //image1 = new ImageIcon("image5_rm.png").getImage();
            image2 = new ImageIcon(imageName1).getImage();
            //image3 = new ImageIcon("image3_rm.png").getImage();
        }
        //자동으로 호출되게끔 순서가 정해져 있다.
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            //이미지를 올려보자!!!!!!!
            g.drawImage(image1,100,100,100,100,null);
            g.drawImage(image2,200,200,100,100,null);
            //g.drawImage(image3,300,300,100,100,null);
        }

    }// end of static inner class

    public static void main(String[] args) {
        new MyImageFrame();
    }



}
