//Program to print the name "RIHANNA" in a complex pattern using nested loops
class rihana
{
    public void disp()
    {
        int x=0,y=0,z=0,n=0,m=6,g=1,j=2;
        for(int a=1;a<=7;a++)
        {
            if(a==1||a==2||a==3||a==4)
            {
                for(int d=1;d<=3;d++)
                {
                    System.out.print("*");
                }
                for(int d=1;d<=3;d++)
                {
                    if(a==2||a==3)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                for(int d=1;d<=3;d++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int d=1;d<=3;d++)
                {
                    System.out.print("*");
                }
                for(int d=1;d<=g;d++)
                {
                    System.out.print(" ");
                }
                for(int d=1;d<=3;d++)
                {
                    System.out.print("*");
                }
                for(int d=j;d>=1;d--)
                {
                    System.out.print(" ");
                }
                g++;
                j--;
            }
            //R
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            //I
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            if(a==4)
            {
                for(int d=1;d<=3;d++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int d=1;d<=3;d++)
                {
                    System.out.print(" ");
                }
            }
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            
            //H
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
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
                if(y==6||y==8)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int e=1;e<=3;e++)
            {
                System.out.print("*");
            }
            for(int e=7;e>=1;e--)
            {
                System.out.print(" ");
            }
            //A
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            for(int d=1;d<=n;d++)
            {
                System.out.print(" ");
            }
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            for(int d=m;d>=1;d--)
            {
                System.out.print(" ");
            }
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            //N
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            for(int d=1;d<=n;d++)
            {
                System.out.print(" ");
            }
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            for(int d=m;d>=1;d--)
            {
                System.out.print(" ");
            }
            for(int d=1;d<=3;d++)
            {
                System.out.print("*");
            }
            //N
            for(int d=1;d<=1;d++)
            {
                System.out.print(" ");
            }
            //Space
            
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
                if(z==6||z==8)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int e=1;e<=3;e++)
            {
                System.out.print("*");
            }
            //A
            System.out.println();
            x+=2;
            y+=2;
            z+=2;
            m--;
            n++;
        }
    }
}