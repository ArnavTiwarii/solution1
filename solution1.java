import java.util.Scanner;
public class solution1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();sc.nextLine();
        int c=number(a);
        if(c%3==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static int number(int a1)
    {
        int v,c=0;
        if(a1>0)
        {
            v = a1 % 10;
            c = c + a1;
            a1 = a1 / 10;
        }
        return c;
    }
}
class Myclase
{
    int num;
   Myclase(int num)
   {
       this.num=num;
   }
}
