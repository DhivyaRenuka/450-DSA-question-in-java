import java.lang.*;
import java.io.*;
class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        
       StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
      
        }
