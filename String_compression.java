public class String_compression {
    public static String String_compression(String str)
    {
    String newStr = " " ;
    // aaabc
    for ( int i = 0 ; i < str.length ( ) ; i ++ ) {
        Integer count = 1 ;
        while ( i < str.length ( ) - 1 && str.charAt ( i )== str.charAt ( i + 1 ) ) 
        {
            count ++ ;
            i ++ ;
        }
        newStr+= str.charAt ( i ) ;
        if ( count > 1 ) {
            newStr+= count.toString();
        }
    }
    return newStr;//O(n)
}
public static void main(String[] args) {
    String str="aaabbbccdde";
    System.out.println( String_compression(str));
   
}
}