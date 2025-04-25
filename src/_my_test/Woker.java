package _my_test;

public class Woker extends Thread{

    private String name;

    public void Worker(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for(int i =0 ; i < 10; i++){
            System.out.println(name +" : "+ i);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("뭔가 일어남");
                Thread.currentThread();//오류 뭐났나 확인해라고 있는거
            }

        }
    }

    //테스트 실행하는 코드
    public static void main(String[] args)  {




    }//end of main


}//end of class


