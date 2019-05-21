public class Megabytesconverter
{
    public static void main(String[] args){
printmegabytesandkilobytes(2500);
    }
    public static void printmegabytesandkilobytes(int kilobytes)
    {
        if(kilobytes<0) {
            System.out.println("invalid value");
        }
        else{
            int mb = kilobytes / 1024;
            int rem = kilobytes%1024;
            System.out.println(kilobytes+ "kb = " +mb+ "mb and " +rem+ "kb");
        }
    }
}
