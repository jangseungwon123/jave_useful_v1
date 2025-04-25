package thread;

public class Worker2MainTest {

    public static void main(String[] args) {

        //상속을 활용한 쓰레드 생성
        //Worker worker1 = new Worker("워커1");
        //worker1.start();;

        //인터페이스를 활용해서 쓰레드를 start시키는 방법
        Worker2 worker2 = new Worker2();
        //인테페이스를 사용할때 start메서드 없어 동작 못시킴
        //worker2.start();
        Thread subT1 = new Thread(worker2);
        subT1.start();

    }// end of main

}//end of class

