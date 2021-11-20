import java.util.*;
public class book {
    String bookname;
    int price;
    String author;
    book(String bookname, int price, String author){
        this.bookname=bookname;
        this.price=price;
        this.author=author;
    }
}
class reader{
    String bookname;
    String author;
    int price;
    String rname;
    String date;


    reader(String bookname,String author, int price,String rname,String date){
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.rname=rname;
        this.date=date;
    }
}
class Dcoder
{
    public static  void main(String args[])
    {
        ArrayList <book> books = new ArrayList<book>();
        ArrayList <reader> read =new ArrayList<reader>();
        System.out.println("Welcome To BIT E-LIBRARY");

        System.out.println("Press 1 : Add book");
        System.out.println("Press 2 : Give book to reader");
        System.out.println("Press 3 : view books");
        while (true){
            System.out.println("Enter your CHOICE");
            Scanner ip=new Scanner(System.in);
            int c=ip.nextInt();
            switch (c){
                case 1:
                    Scanner b=new Scanner(System.in);
                    System.out.println("Enter the details of the book");
                    String tempbookname;
                    int tempprice;
                    String tempauthor;


                    System.out.println("Enter Book  name");
                    tempbookname=b.nextLine();

                    System.out.println("Enter author name");

                    tempauthor=b.nextLine();


                    System.out.println("Enter Price");
                    tempprice=b.nextInt();


                    books.add(new book(tempbookname,tempprice,tempauthor));
                    break;
                case 2:
                    Scanner r=new Scanner(System.in);
                    String tempreadbookname;
                    String tempreadname;
                    int tempreadprice;
                    String tempreadauthor;
                    String tempdate;
                    int n;

                    System.out.println("Enter name of book");
                    tempreadbookname=r.nextLine();

                    System.out.println("Enter Author");
                    tempreadauthor=r.nextLine();

                    System.out.println("Enter name of reader");
                    tempreadname=r.nextLine();

                    System.out.println("Enter date of Taken");
                    tempdate=r.nextLine();

                    System.out.println("Enter price");
                    tempreadprice=r.nextInt();

                    read.add(new reader(tempreadbookname,tempreadauthor,tempreadprice,tempreadname,tempdate));

                    System.out.println("Enter index of book");
                    n=r.nextInt();
                    try{
                        books.remove(n);
                    }
                    catch (Exception e){
                        System.out.println("Please recheck the index no");
                    }
                    break;
                default:
                    System.out.println("Looking Forward to the Weekend");
                case 3:
                    System.out.println("Coming Soon");

            }

        }




    }
}