import java.util.Scanner;

class CarPrice  //Declaring Class
{
    long price;  //Declaring Variables
    double exe;
    char type;
    CarPrice(long p,char t)  //Parameterized Constructor for initialisng the variables
    {
        price=p;
        type=t;
    }
    public void calex()  //Method for Calculating the Excise Amount
    {
        if(type=='N')
        exe=22*price/100;
        else if(type=='S')
        exe=11*price/100;
        else if(type=='L')
        exe=5*price/100;
        else
        exe=0;
    }
    public void print()  //Method for printing the output
    {
        System.out.println("Car Price="+price);  //Printing Output
        System.out.println("Excise="+exe);  //Printing Output
    }
    public static void main(String[] args) // Standard main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Price: ");
        long p = sc.nextLong(); // Read price input
        System.out.print("Enter Car Type (N, S, or L): ");
        char t = sc.next().toUpperCase().charAt(0); // Read character input
        CarPrice ob = new CarPrice(p, t);
        ob.calex();
        ob.print();
        sc.close();
}  //Class Closed
}