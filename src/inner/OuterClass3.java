package inner;

/**
 * 익명내부 클래스란?
 * 익명(익명이란? 이름이 없다)
 */
public class OuterClass3 {

    Runnable runnable; //인터페이스다.
    //인터페이스는 기본적으로 인스턴스화 안됨.
    //하지만 익명 내부 클래스로 구현할 수 있다.

    public OuterClass3(){
        //1.구현부를 만들어준다.
        //2.추상메서드를 구현 메서드로 변경해준다
        new Runnable(){
            @Override
            public void run() {

            }
        };
    }

    public static void main(String[] args) {

        //익명클래스란 이름이 없는 클래스이다.
        //OuterClass3 outerClass3 =new OuterClass3();//익명클래스이다
        new OuterClass3();//익명클래스이다

    }
}
