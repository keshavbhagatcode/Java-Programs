import java.util.*;
class SchoolFees
{
    String Name,Class;
    int Date,ch,TF,OF,Month;
    double bill;
    public void list()
    {
        System.out.println("=================================ST. XAVIER'S SCHOOL=================================");
        System.out.println();
        System.out.println("ADMISSION FEE(NR-XII):          RS.16000/-");
        System.out.println("SECURITY DEPOSIT:               RS.4000/-");
        System.out.println("ANNUAL CHARGES:                 RS.2000/-");
        System.out.println();
        System.out.println("MONTHLY FEES:");
        System.out.println("TUITION FEE(NR-X):              RS.1450/-");
        System.out.println("TUITION FEE(XI-XII):            RS.1700/-");
        System.out.println("MAINTENANCE FEE:                RS.200/-");
        System.out.println("COMPUTER FEE(I-X):              RS.100/-");
        System.out.println("COMPUTER FEE(XI-XII):           RS.200/-");
        System.out.println("LABORATORY FEE(IX-X):           RS.100/-");
        System.out.println("LABORATORY FEE(XI-XII):         RS.200/-");
        System.out.println();
        System.out.println("MONTHLY TRANSPORT FEES");
        System.out.println("1.ULHAAS,JOTERAM,GANGPUR:                                                 RS.500/-"); 
        System.out.println("2.BURDWAN TOWN,DM BUNGALOW,KALNA GATE,SAKTIGARH,BARSUL:                   RS.600/-");
        System.out.println("3.RASULPUR,AGRICULTURE FARM,RAIPUR:                                       RS.700/-");
        System.out.println("4.KALANABAGRAM,BISHNUPUR:                                                 RS.750/-");
        System.out.println("5.MEMARI,PALLA ROAD,ATAGARH,KASHIARA,POLEMPUR TO SEHERA BAZAR:            RS.800/-");
        System.out.println("6.MAGALMARI MORE,PALSIT,PUTUNDA,RENESHA:                                  RS.1000/-");
        System.out.println("7.BOINCHEE:                                                               RS.1200/-");
        System.out.println();
        System.out.println("OPTIONAL FEE");
        System.out.println("1.KARATE:              RS.300/-");
        System.out.println("2.SWIMMING:            RS.50/-");
        System.out.println("=====================================================================================");

    }

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF THE STUDENT");
        Name=sc.nextLine();
        System.out.println("ENTER CLASS OF THE STUDENT:NR-XII");
        Class=sc.next();
        System.out.println("ENTER THE DATE OF SUBMISSION OF FEES");
        Date=sc.nextInt();
        System.out.println("ENTER THE MONTH OF SUBMISSION OF FEES:1-12");
        Month=sc.nextInt();
        System.out.println("WHAT YOU WANT TO DO: \n 1.MONTHLY FEES \n 2.ADMISSION FEE+MONTHLY FEE");
        ch=sc.nextInt();
        System.out.println("ENTER THE LOCATION FOR TRANSPORT:FROM OPTIONS 1-7 OR 0 IF NONE");
        TF=sc.nextInt();
        System.out.println("ENTER THE OPTION FOR OPTIONAL FEE:FROM OPTIONS 1-2 OR 0 IF NONE");
        OF=sc.nextInt();
        Class=Class.trim();
        sc.close();
    }

    public void calculate()
    {
        if(ch==2)
            bill+=16000;
        if(Month==4)
            bill+=2000;
        bill+=4000;
        bill+=200;
        if(Class.equalsIgnoreCase("NR")||Class.equalsIgnoreCase("I")||Class.equalsIgnoreCase("II")||Class.equalsIgnoreCase("III")||Class.equalsIgnoreCase("IV")||Class.equalsIgnoreCase("V")||Class.equalsIgnoreCase("VI")||Class.equalsIgnoreCase("VII")||Class.equalsIgnoreCase("VIII")||Class.equalsIgnoreCase("IX")||Class.equalsIgnoreCase("X"))
            bill+=1450;
        else if(Class.equalsIgnoreCase("XI")||Class.equalsIgnoreCase("XII"))
            bill+=1700;
        if(Class.equalsIgnoreCase("I")||Class.equalsIgnoreCase("II")||Class.equalsIgnoreCase("III")||Class.equalsIgnoreCase("IV")||Class.equalsIgnoreCase("V")||Class.equalsIgnoreCase("VI")||Class.equalsIgnoreCase("VII")||Class.equalsIgnoreCase("VIII")||Class.equalsIgnoreCase("IX")||Class.equalsIgnoreCase("X"))
            bill+=100;
        else if(Class.equalsIgnoreCase("XI")||Class.equalsIgnoreCase("XII"))
            bill+=200;
        if(Class.equalsIgnoreCase("IX")||Class.equalsIgnoreCase("X"))
            bill+=100;
        else if(Class.equalsIgnoreCase("XI")||Class.equalsIgnoreCase("XII"))
            bill+=200;
        if(TF==1)
            bill+=500;
        else if(TF==2)
            bill+=600;
        else if(TF==3)
            bill+=700;
        else if(TF==4)
            bill+=750;
        else if(TF==5)
            bill+=800;
        else if(TF==6)
            bill+=1000;
        else if(TF==7)
            bill+=1200;
        else 
            bill+=0;
        if(OF==1)
            bill+=300;
        else if(OF==2)
            bill+=50;
        else
            bill+=0;
        if(Date>20)
            bill=bill+(Date-20)*30;
    }

    public void receipt()
    {
        System.out.println("=============================RECEIPT=============================");
        System.out.println("NAME:               "+Name);
        System.out.println("CLASS:              "+Class);
        System.out.println("DATE:               "+Date+"/"+Month);
        System.out.println("BILL:            Rs."+bill+"/-");
        System.out.println("");
    }

    public void main()
    { 
        SchoolFees ob=new SchoolFees();
        ob.list();
        ob.input();
        ob.calculate();
        ob.receipt();
    }
}