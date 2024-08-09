import java.util.*;
class library{
    String book;
    String member;
    void addbook()
    {
        System.out.println("adding book");
    }
    void removebook()
    {
        System.out.println("Removing book");

    }
    void findbook(){
        System.out.println("Finding book");

    }
}
class book extends library{
    String title;
    String author;
    String isbn;
    void issuebook(String name)
    {
        book=name;
    }
    void returnbook(String name)
    {
        book=name;
    }
    void displaybook()
    {
       System.out.println(book);
       System.out.println(author);
    }
}
class student extends book{
   String name;
   int regno;
   void data()
   {
    System.out.println(name);
    System.out.println(regno);
    System.out.println(book);
   }
}
public class Librarymangement {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the book name to add");
        library l=new library();
        l.addbook();
        l.book=inp.nextLine();
        book bo=new book();
        System.out.println("Enter title");
        bo.title=inp.nextLine();
        System.out.println("Enter the author");
        bo.author=inp.nextLine();
        System.out.println("Enter the user data");
        student s1=new student();
        s1.name=inp.nextLine();
        System.out.println("enter the reg no");
        s1.regno=inp.nextInt();
        
        bo.displaybook();
        s1.data();
    }
}
