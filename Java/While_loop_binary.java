/* WAP to enter the number from keyboard and check wheather the number is binary or not */
package aayushi_java;
import java.util.*;

public class While_loop_binary {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int a, n,flag=0;
        System.out.println("Enter a number: ");
        n=input.nextInt();
        
        while(n>0)
        {
            a=n%10;
            if(a>=2)
            {
                flag=1;
                break;
            }
            n=n/10;
        }
        if(flag==0)
        {
            System.out.println("Binary.");
        }
        else
        {
            System.out.println("Not binary");
        }
    }
}