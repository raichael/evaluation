public class areacalculator {
    public static void main(String[] args)
    {
        System.out.println(area(3.4));
        System.out.println(area(1.2,1.2));
    }
    public static double area(double radius)
    {
        if(radius>0){
            double a1 = radius*radius*Math.PI;
            return a1;
        }
        else{
            return -1.0;
        }
    }

    public static double area(double x,double y)
    {
        if (x>0 && y>0)
        {
            double r1 = x*y;
            return r1;
        }
        else
        {
            return -1.0;
        }
    }
}
