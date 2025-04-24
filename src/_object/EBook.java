package _object;

public class EBook {

    private int bookTypeId;
    public  String title;
    public String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }
    //toString() 재정의
    @Override
    public String toString() {
        return "EBook";
    }
    //equals ()메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if (this.title.equals(title))
        return super.equals(obj);
        return false;
    }
    //hashCode()메서드 재정의
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        EBook book1 = new EBook(1, "데미안", "헤르만헤세");
        EBook book2 = new EBook(1, "데미안", "헤르만헤세");
        EBook book3 = new EBook(2, "자바", "홍길동");
        EBook book4 = new EBook(1, "데미안", "파울로코엘로");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        boolean result1 = book1.equals(book1);
        boolean result2 = book1.equals(book2);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);

    }
}
