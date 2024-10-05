public class equal_halves {
    public static boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int c=0;
        int c1=0;
        String s1=s.substring(0,s.length()/2);
        System.out.println("s1"+s1);
        
        String s2=s.substring(s.length()/2);
        System.out.println("s2"+s2);
        for(int i=0;i<s1.length();i++){
             if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
             c++;
        }
        for(int j=0;j<s2.length();j++){
             if(s2.charAt(j)=='a'||s2.charAt(j)=='e'||s2.charAt(j)=='i'||s2.charAt(j)=='o'||s2.charAt(j)=='u')
             c1++;
        }
        if(c==c1)
        return true;
        else 
        return false;
    }

public static void main(String[] args) {
    String s="textbook";
    if(halvesAreAlike(s)==true)
    System.out.println("true");
    else
    System.out.println("false");
}
}