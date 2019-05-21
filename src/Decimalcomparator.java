public class Decimalcomparator {
    public static void main(String[] args) {
        System.out.println(areequalbythreedecimalplaces(3.1034,3.00356));
    }
    public static boolean areequalbythreedecimalplaces(double x,double y)
    {
      if((int)(x*1000)==(int)(y*1000)) {
          return true;
      }
      else{
          return false;
      }
    }

}
