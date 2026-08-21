import java.util.*;  //Importing Package
class BikeRental  //Declaring Class
{
    int bno,phno,days,charge;  //Declaring Variables
    String name;  //Declaring Variable
    public void input()  //Method for Taking the Input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");  //Inputting Name
        name=sc.nextLine();
        System.out.println("Enter Bike Number");  //Inputting Bike Number
        bno=sc.nextInt();
        System.out.println("Enter Phone Number");  //Inputting Phone Number
        phno=sc.nextInt();
        System.out.println("Enter Days");  //Inputting Number of Days
        days=sc.nextInt();
        sc.close();
    }

    public void compute()  //Method for Calculating Charge
    {

        if(days<=5)  
            charge=1000*5;
        else if(days<=10)
            charge=5000+(days-5)*900;
        else
            charge=5000+5*900+(days-15)*600;

    }

    public void display()  //Method for Printing output
    {
        System.out.println("Bike No.\t\tPhone no.\t\tName\t\tDays\t\tCharge \n"+bno+"\t\t\t"+phno+"\t\t"+name+"\t\t"+days+"\t\t"+charge);  //Printing ouput
    }
    public void main()  //Main method for calling all methods
    {
        BikeRental ob=new BikeRental();
        ob.input();
        ob.compute();
        ob.display();
    }  //Method Closed
}  //Class Closed

