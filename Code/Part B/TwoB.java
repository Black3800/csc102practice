import java.util.Scanner;

public class TwoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<x; i++)
        {
            for(int j=0; j < x*2 + 1; j++)
            {
                System.out.print("o");
            }
            System.out.print("\n");
        }
    }
}