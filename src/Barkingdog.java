public class Barkingdog {
    public static void main(String[] args){
        System.out.println(shouldwakeup(true,6));
    }
    public static boolean shouldwakeup(boolean barking,int hourofday)
    {
        if(barking==true)
        {
        if(hourofday<0||hourofday>23)
        {
            return false;
        }
        if(hourofday < 8 || hourofday > 22){
            return barking;
        }
        else
        {
            return false;
        }}
        else
        {
            return false;
        }

    }
}
