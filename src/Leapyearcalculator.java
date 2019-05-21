public class Leapyearcalculator {
    public static void main(String[] args){
        System.out.println(isleapyear(2001));
    }
    public static boolean isleapyear(int year)
    {
        if(year>=1 && year<=9999) {
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
            else {
                return false;
        }

    }
}
