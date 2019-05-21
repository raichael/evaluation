public class equalsumchecker {
    public static void main (String[] args){
        System.out.println(hasequalsum(3,2,5));
    }
    public static boolean hasequalsum(int x,int y,int z)
    {
        int x1=x+y;
        if(x1==z)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
