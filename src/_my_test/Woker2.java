package _my_test;

public class Woker2 implements Runnable{

    @Override
    public void run() {
        for (int i =0; i < 10 ; i++){
            System.out.print(i + "\t");
            try{
                Thread.sleep(300);
            } catch (RuntimeException | InterruptedException e) {

            }
        }
    }
}
