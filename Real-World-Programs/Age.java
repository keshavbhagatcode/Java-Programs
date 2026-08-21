import java.util.*;
class IncomeCalculator
{
    public void disp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        System.out.println("Enter Gender:Male or Female");
        String gen=sc.next();
        double tax=0;
        if(age>65||gen.equalsIgnoreCase("Female"))
        {
            System.out.println("Wrong Category");
        }
        else
        {
            System.out.println("Enter Taxable Income");
            double TI=sc.nextDouble();
            if(TI<=160000)
                tax=0;
            else if(TI<=500000)
                tax=((TI-160000)*10)/100;
            else if(TI<=800000)
                tax=(((TI-500000)*20)/100)+34000;
            else
                tax=(((TI-800000)*30)/100)+94000;
            System.out.println("Payable Income Tax=Rs."+tax);
        }
        sc.close();
    }
    
}