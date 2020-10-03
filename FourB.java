public class FourB {
    public static void main(String[] args) {
        int x = 6;
        switch(x)
        {
            case 5:
                for(int i=0; i<x; i++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
                break;
            case 6:
                for(int i=0; i<x; i+=2)
                {
                    System.out.print("x");
                    x++;
                }
                System.out.print("\n");
            case 7:
                for(int i=x; i>0; i-=2)
                {
                    System.out.print("o");
                    i++;
                }
                System.out.print("\n");
            default:
                break;
        }
    }
}
