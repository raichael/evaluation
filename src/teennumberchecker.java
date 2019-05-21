public class teennumberchecker {
    public static void main(String[] args)
    {
        System.out.println(hasteen(33,44,25));
        System.out.println(isteen(14));
    }
public static boolean hasteen(int x,int y,int z){
        if((x>=13&&x<=19) || (y>=13&&y<=19) || (z>=13&&z<=19))
        {
         return true;
    }
        else {
            return false;
        }
}

public static boolean isteen(int a){
        if(a>=13&&a<=19)
        {
            return true;
        }
        else
        {
            return false;
        }
}

}
