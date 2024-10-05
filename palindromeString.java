import java.util.*;
public class palindromeString {
    public static boolean palind(String str)
    {
       String str2=str;
       String str3="";
       for(int i=str2.length()-1;i>=0;i--)
       {
        char b=str2.charAt(i);
        str3=str3+b;
       }
       if(str3.equals(str))
       return true;
       else
       return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(palind(str)==true)
        System.out.println("true");
        else
        System.out.println("false");
    }
}
