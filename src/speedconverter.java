public class speedconverter {
    public static long tomilesperhour(double kilometersperhour) {
        if (kilometersperhour > 0) {
            double mile = kilometersperhour / 1.609;
            long m1 = Math.round(mile);
            return m1;
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersperhour){
        if(kilometersperhour < 0){
            System.out.println("invalid value");
        }
        else{
            double mile = kilometersperhour / 1.609;
            long m1 = Math.round(mile);
            System.out.println(kilometersperhour+"km/h = " +m1+"m/h");
        }
    }
        public static void main(String[] args)
        {
            System.out.println(tomilesperhour(3.12));
            printConversion(-1.5);
        }
    }
