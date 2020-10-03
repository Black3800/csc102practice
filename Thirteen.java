public class Thirteen {
    public static void main(String[] args) {
        int a = 0, b = 1;
        if(a == 1 | ++b == 1)
        {
            a = 5;
            b = a + b;
        }
        else
        {
            a = 1;
            b -= a;
        }
        System.out.println(a*b);
    }
}
