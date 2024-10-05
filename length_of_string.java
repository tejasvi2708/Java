public class length_of_string {
    public static int length(String s,int i){
        if(i==s.length()){
       return i;
        }
      return  length(s,i+1);
    }
    public static void main(String[] args) {
        String s="abcdef jn";
        System.out.println(length(s,0));

    }
}
