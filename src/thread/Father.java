package thread;

public class Father extends Thread{
    //입금 요총 --->3초
    BankAccount bankAccount;

    public Father(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        //계좌 입금요청---3초걸림 Thread로 구성
        bankAccount.deposit(10000);
    }
}
