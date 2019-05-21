public class Minutestoyearsanddaycalculator {
    public static void main(String[] args){
printyearsanddays(561600);
    }
    public static void printyearsanddays(long minutes)
    {
        if(minutes>0){
        long days = minutes / 1440;
        long year = days / 365;
        long rdays = days - (365*year);
        System.out.println(minutes+ "min " +year+ "y and " +rdays+ "d");
    }
        else{
            System.out.println("invalid value");
        }
}}