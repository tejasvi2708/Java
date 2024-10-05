public class shortest_path {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char b=path.charAt(i);
            if(b=='E')
            {
                x++;
            }
            else if(b=='W')
            {
                x--;
            }
            else if(b=='N')
            {
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        float result=(float)Math.sqrt(x2+y2);
        System.out.println(result);
    }
}
