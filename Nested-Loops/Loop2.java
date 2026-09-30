//Program to print 'A' letter in pattern
class Patt
{
    public void main()
    {
        int x=0;
        for(int a=1;a<=7;a++)
        {
            for(int b=a;b<=7;b++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=3;c++)
            {
                System.out.print("*");
            }
            for(int d=1;d<=x;d++)
            {
                if(x==6||x==8)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int e=1;e<=3;e++)
            {
                System.out.print("*");
            }
            System.out.println();
            x+=2;
        }
    }
}