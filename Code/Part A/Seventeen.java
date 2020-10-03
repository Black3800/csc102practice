import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a + b * c - d == 24)
        {
            System.out.println("You won the lottery!");
        }
        else if(a + b * c - d == 10)
        {
            System.out.println("You won second prize!");
        }
        else
        {
            System.out.println("Sorry, you have bad luck.");
        }

        int x = 0;
        int i = 1;

        switch (i)
        {
            case 1:
                x += i++;
            case 2:
                x += i++ * 2;
            case 3:
                x += i++ * 3;
            default:
                x += i;
        }
        System.out.println(x);
    }
}
