/*Program to print,
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
*/
class Loop1
{
    public void disp()
    {
        int a=4;
        int z=1;
        for(int i=1;i<=9;i+=2)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
        for(int b=7;b>=1;b-=2)
        {
            for(int f=1;f<=z;f++)
            {
                System.out.print(" ");
            }
            for(int d=1;d<=b;d++)
            {
                System.out.print("*");
            }
            System.out.println();
            z++;
        }
    }
}