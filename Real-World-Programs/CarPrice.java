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
    public void main()  //Main method for calling all the methods
    {
        CarPrice ob=new CarPrice(20000,'N');
        ob.calex();
        ob.print();
    }
}  //Class Closed