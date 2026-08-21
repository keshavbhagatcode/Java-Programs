import java.util.*;  //Importing Package
class ClassStudentAverage  //Declaring Class
{
    private int adno;  //Declaring Variable
    private String name;  //Declaring Variable
    private int marks[];  //Declaring Variable
    private double average;  //Declaring Variable
    private double getavg()  //Method for getting the average of 5 subjects
    {
        double s=0;
        for(int i=0;i<5;i++)
        s=s+marks[i];
        s=s/5.0;
        return s;
    }
    public void readinfo()  //Method for taking the input
    {
        marks=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Admission Number:");
        adno=sc.nextInt();
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Marks of the Student in 5 Subjects:");
        for(int i=0;i<5;i++)
        marks[i]=sc.nextInt();
        average=getavg();
        sc.close();
    }
    public void displayinfo()  //Method for Printing the results
    {
        System.out.println("Admission Number:"+adno);
        System.out.println("Name:"+name);
        System.out.print("Marks in 5 Subjects:");
        for(int i=0;i<5;i++)
        System.out.print(marks[i]+",");
        System.out.println("Average:"+average);
    }

    public void compareavg(double cavg)  //Method for Comparing the student average with class average
    {
        System.out.println("Average of Student:"+average);
        System.out.println("Average of Class:"+cavg);
    }
    public void main()  //Main method for calling all methods 
    {
        Scanner sc=new Scanner(System.in);
        ClassStudentAverage ob=new ClassStudentAverage();
        ob.readinfo();
        ob.displayinfo();
        System.out.println("Enter the Class Average");
        double cavg=sc.nextDouble();
        ob.compareavg(cavg);
        sc.close();
    }  
}  //Class closed