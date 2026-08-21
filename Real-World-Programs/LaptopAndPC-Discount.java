import java.util.*;  //Importing Package
class LaptopAndPCDiscount  //Declaring Class
{
    public void display()  //Declaring Method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");  //Inputting Name
        String name=sc.nextLine();
        System.out.println("Enter Address");  //Inputting Address
        String add=sc.nextLine();
        System.out.println("Enter Amount");  //Inputting Amount
        double amt=sc.nextDouble();
        System.out.println("Enter Choice:L or P");  //Inputting Choice
        char ch=sc.next().charAt(0);
        double net=0,d=0;
        if(ch=='L'||ch=='l')  //Calculating Discount if choice if l or L(Laptop)
        {
            if(amt<=25000)
                d=0*amt/100;
            else if(amt<=57000)
                d=5*amt/100;
            else if(amt<=100000)
                d=7.5*amt/100;
            else
                d=10*amt/100;

        }
        else if(ch=='P'||ch=='p')  //Calculating Discount if choice is p or P(PC)
        {
            if(amt<=25000)
                d=5*amt/100;
            else if(amt<=57000)
                d=7.5*amt/100;
            else if(amt<=100000)
                d=10*amt/100;
            else
                d=15*amt/100;

        }
        System.out.println("Name="+name+"\n"+"Address="+add+"\n"+"Net=Rs."+(amt-d));  //Printing Output
        sc.close();
    }  //Method Closed
}  //Class Closed