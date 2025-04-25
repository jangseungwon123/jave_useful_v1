package thread;

public class BankAccountMainTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Father father = new Father(bankAccount);
        Mother mother = new Mother(bankAccount);

        //아버지가 먼저 입금 요청
        father.start();// 3초 걸림
        //어머니가 출금요청
        mother.start();;

        //입금,출금,동일계좌에서 처리중입니다
        //10만원 +1만원 -5천원==> 10만원5천원
        //TODO주의 !!멀티스레딩 프로그램을 한다면 race condition상태를 만들어 낸다.
        //의도치 않은 결과를 발생 시킬 수 있다.


    }// end of main

}//end of class
