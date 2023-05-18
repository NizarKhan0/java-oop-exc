public class Book {
    private String bookCode;
    private String title;
    private double price;
    private String author;
    
    //default constructor
    public Book(){
        String bookCode = null;
        String title = null;
        double price = 0.00;
        String author = null;
    }
    
    //copy constructor
    public Book(Book bk){
        this.bookCode = bk.bookCode;
        this.title = bk.title;
        this.price = bk.price;
        this.author = bk.author;
    }
    
    //accessor
    public String getBookCode(){return bookCode;}
    public String getTitle(){return title;}
    public double getPrice(){return price;}
    public String getAuthor(){return author;}
    
    //mutator
    public void setBookCode(String bookCode){this.bookCode = bookCode;}
    public void setTitle(String title){this.title = title;}
    public void setPrice(double price){this.price = price;}
    public void setAuthor(String author){this.author = author;}
    
    //toString()
    public String toString() {
        return "\nBook Code: " + bookCode + "\nTitle: " + title + "\nPrice : RM" + price + "\nAuthor: " + author;
    }
}