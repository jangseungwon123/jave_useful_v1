package _string;

public class StringTest1 {
    //변수
    //생성자
    //매서드

    //코드의 진입점
    public static void main(String[] args) {

        //String pool
        String str1 = "문자열1";
        //Heap
        String str2 = new String("abc");
        String str3 = new String("abc");

        //참조 비교 : 각각 객체의 주소 비교 주소 ==주소
        //21-->??
        System.out.println("str2 == str3 :" + (str2 == str3));

        //문자열을 리터럴 방식으로 만들어 보자.
        //문자열은 아주 많이 사용되는 데이터;
        String str4 = "abc";
        String str5 = "abc";
        //재활용된것이다.
        String str6 = "abc";
        System.out.println("str4 == str5 :" + (str4 == str5));

        String str7 = str6 + "안녕 ";
        System.out.println(str7);

    }//end of main
}
