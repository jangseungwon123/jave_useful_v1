package _string;

public class StringTest3 {

    public static void main(String[] args) {
        String str1 = "ABCD";
       int countStr1= str1.length();
        System.out.println("countStar1 : " + countStr1);

        // replace 메서드 문자열 내에서 특정 문저욜을 다른 문자열로 교체하는데
        //사용할 수 있다.
        String str2 = "Hello World";
        String str3 = str2.replace("World", "Java");
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str2 : " + str2);
        // 출력값
//        str2 : Hello World
//        str3 : Hello Java
//        str2 : Hello World

        //substring 메서드는 문자열 일부분을 추출하여 새로운 문자열을 반환함
        //두가지 오버로딩된 메서드를 제공
        //startIndex -->포함
        //endIndex -->불포함
        //문자열 인덱스 인덱스는 0부터 시작
        String result3 = str2.substring(0,5);
        System.out.println("result3 :" + result3);
    }
}
