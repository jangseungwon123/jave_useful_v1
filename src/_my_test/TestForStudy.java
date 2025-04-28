package _my_test;

public class TestForStudy {

    int number1;
    int number2;
    String name;

    public TestForStudy(int number1,int number2, String name) {
        this.number1=number1;
        this.number2=number2;
        this.name=name;
    }

    //메서드
    public int testCall(String name){
        // 위 소괄호에 name이라는 매개변수를 받도록 해주세요.
        // name이라는 매개변수를 이용하여 출력문을 작성 해주세요.
        System.out.println("name : " + name);
        int result = 80;
        return result;
    }

    //함수의 진입점
    public static void main(String[] args) {
        TestForStudy test1 = new TestForStudy(1,2,"홍길동");

        String cheak = "홍길동";
        int number = test1.testCall(cheak);
        System.out.println(number);
    }// end of main

}
