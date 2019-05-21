public class playingcat {
    public static void main(String[] args){
        System.out.println(iscatplaying(false,36));
    }
    public static boolean iscatplaying(boolean summer,int temperature)
    {
        if(temperature>=25 && temperature<=35)
        {
            return true;
        }
        else if((summer==true) && (temperature>=25 && temperature>=45))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
