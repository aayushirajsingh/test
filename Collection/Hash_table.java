/* write a program that shows the use of hashtable class */
package aayushi_java.Collection;
import java.io.*;
import java.util.*;

public class Hash_table {
    public static void main(String[] args) throws IOException
    {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Ajay",50);
        ht.put("Sachin",77);
        ht.put("Gavaskar",44);
        ht.put("Kapil",60);
        ht.put("Dhoni",88);
        
        System.out.println("The player names: ");
        Enumeration e = ht.keys();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter player name: ");
        String name = br.readLine();
        name=name.trim();
        
        Integer score = ht.get(name);
        if(score != null)
        {
            int sc = score.intValue();
            System.out.println(name+" Scored: "+sc);
        }
        else
        {
            System.out.println("Player not found");
        }
    }
}