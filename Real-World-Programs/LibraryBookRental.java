import java.util.*;  //Importing Package
class LibraryBookRental  //Declaring Class
{
    int acc_num;  //Declaring Variable
    String title,auth;  //Declaring Variables
    int days;  //Declaring Variable
    Scanner sc=new Scanner(System.in);
    public void input()  //Method for Taking Input
    {
        System.out.println("Enter Title of Book");  //Inputting the Title
        title=sc.nextLine();
        System.out.println("Enter Author of the Book");  //Inputting the name of author
        auth=sc.nextLine();
        System.out.println("Enter Accession Number");  //Inputting the accession number
        acc_num=sc.nextInt();
    }
    public void compute()  //Method for calculating the fine
    {
        System.out.println("Enter Days Late");
        days=sc.nextInt();
        System.out.println("Fine=Rs."+(days*2));
    }
    public void display()  //Method for Printing the Output
    {
        System.out.println("Accession Number="+acc_num);
        System.out.println("Title="+title);
        System.out.println("Author="+auth);
    }
    public void main()  //Main Method for Calling all the Methods
    {
        LibraryBookRental ob=new LibraryBookRental();
        ob.input();
        ob.compute();
        ob.display();
    }
}  //Class Closed