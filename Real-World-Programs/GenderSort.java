import java.util.Scanner;  //Importing Package
class GenderSort  //Declaring Class
{
    public static void main(String[] args)  //Declaring Method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Students");  //Taking Input the number of students
        int n=sc.nextInt();
        String b[]=new String[n];
        String g[]=new String[n];
        int x=0,y=0;
        for (int i=0;i<n;i++)  //Loop for taking input and storing the names according to gender
        {
            System.out.println("Enter the Name of Student");
            String a=sc.next();
            System.out.println("Enter the Gender:B/G");
            char ch=sc.next().charAt(0);
            if (ch=='g'||ch=='G') 
                g[x++]=a;
            else if(ch=='b'||ch=='B') 
                b[y++]=a;

        }
        System.out.println("Girl List:");  //Printing the girls list
        for (int i=0;i<x;i++)
            System.out.println(g[i]);
        System.out.println("Boy List:");  //Printing the boys list
        for (int i=0;i<y;i++)
            System.out.println(b[i]);
        sc.close();
    }  //Method Closed
}  //Class Closed