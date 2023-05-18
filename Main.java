import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String bookCodes;
        String code;
        String code2;
        String publisher;
        char four;
        
        Scanner in = new Scanner(System.in);
        Book book1 = new Book();
        
        System.out.println("Code (BKC1147/BKC2147/BKC3147): ");
        bookCodes = in.nextLine();
        book1.setBookCode(bookCodes);
        
        Book book2 = new Book(book1);

        code = book1.getBookCode();
        code2 = book2.getBookCode();
        four = code.charAt(3);
        
        switch (four) {
            case '1':
                publisher = "Course Pubs";
                break;
            case '2':
                publisher = "Thomson";
                break;
            case '3':
                publisher = "Pocket Book";
                break;
            default :
                publisher = "err";
        }
        
        System.out.println("Book 1 Publisher: " + publisher);
        System.out.println("Book 1 code: " + code);
        System.out.println("Book 2 code: " + code2);
    }
}