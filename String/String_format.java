/* Java String format() method example */
package aayushi_java.String;

public class String_format {
    public static void main(String args[])
    {  
        String name="sonoo";  
        String sf1=String.format("name is %s",name);  
        String sf2=String.format("value is %f",32.33434);  
        String sf3=String.format("value is %32.12f",32.33434);
        System.out.println(sf1);  
        System.out.println(sf2);  
        System.out.println(sf3);
    }
}  