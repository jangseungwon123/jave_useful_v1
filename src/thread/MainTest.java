package thread;

public class MainTest {

    public static void main(String[] args) {

        //Thread란?
        //Process :실행 중인 프로그램 프로그램이 실행되면 OS로 부터 메모리를 할당받아 프로세스 상태가 된다.
        //Thread:- 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는
        // 단위는 thread이다.

        //muto threading이란
        //여러 쓰레드가 동시에 수행괴는 프로그래밍을 말함 여러작업
        //동시 실행효과
        //thread는 각각 자신만에 변수, 메서드를 가질 수 있다.

        //단 , 멀티 쓰레딩 프로그래밍시 주의점있다.
        //각 thread 사이에는 공유하는 자원을 가질 수 있다.
        //여러 쓰레드가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는
        //race condition이 발생할 수 있다.


    }
}
