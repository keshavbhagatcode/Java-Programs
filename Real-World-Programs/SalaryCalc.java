import java.util.*;  //Importing Package
class SalaryCalc  //Declaring Class
{
    int Eno,age,basic;  //Declaring variables
    String Ename;  //Declaring variable
    double net;  //Declaring variable
    public void accept()  //Method for Taking Input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");  //Inputting the Name
        Ename=sc.nextLine();
        System.out.println("Enter Employee Number");  //Inputting the Employee Number
        Eno=sc.nextInt();
        System.out.println("Enter Age of Employee");  //Inputting the Age of the Employee
        age=sc.nextInt();
        System.out.println("Enter Basic Salary");  //Inputting the Basic Salary 
        basic=sc.nextInt();
        sc.close();

    }
    public void calculate()  //Method for Calculating the Net Amount
    {
        double da=(17.45*basic)/100;
        double hra=(18.5*basic)/100;
        double pf=(8.10*basic)/100;
        net=(basic+hra+da)-pf;
        if(age>50)
        net=net+5000;
    }
    public void print()  //Method for printing the output
    {
        System.out.println("ENo.\t\tEmployee Name\t\tAge\t\tBasic Pay\t\tNet Pay \n"+Eno+"\t\t\t"+Ename+"\t\t"+age+"\t\t"+basic+"\t\t\t"+net);  //Printing the Output
    }
    public void main()  //Main Method for Calling all the Methods
    {
        SalaryCalc ob=new SalaryCalc();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}  //Class Closed
