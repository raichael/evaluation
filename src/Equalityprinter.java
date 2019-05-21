public class Equalityprinter {
    public static void main(String[] args){
printequal(3,1,0);

    }
        public static void printequal(int x,int y,int z){
        if(x<=0 || y<=0 || z<=0){
            System.out.println("invalid value");
        }
        else if(x==y && x==z && y==z)
            {
                System.out.println("all numbers are equal");
            }
        else if(x!=y && x!=z && y!=z)
        {
            System.out.println("all numbers are different");
        }
        else
        {
            System.out.println("neither all are equal nor different");
        }
        }

}
