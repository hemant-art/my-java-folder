
import java.util.Scanner;
public class arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size =sc.nextInt();
        //create array
        int [] mir=new int [size];
        //enter your value
        System.out.println("enter an array value");
        for(int i=0;i<size;i++)
        {
            int value =sc.nextInt();
            mir[i]=value;
        }
        int length =mir.length;
        int sum =0;
        for(int i=0;i<mir.length;i++)
        {
            sum+=mir[i];
        }
        double average =sum / length;
        System.out.println("average of array :"+average);
    }
}