public class Nine {
    public static void main(String[] args) {
        int a = 2, b= 1;
        System.out.println(a++*(b+1)+b++);
        a = 2;
        b = 1;
        System.out.println(++a + ++a + ++b + b++);
        a = 2;
        b = 1;
        System.out.println(b++ + a++ + b++ + ++a );
        a = 2;
        b = 1;
        System.out.println(a-- - --a + b++ + ++b - (a-- - 3));
        a = 2;
        b = 1;
        System.out.println((((b++)*b++)*b++)+ b++ - --a);

        /*int a = 3;
        int result = (++a) + 1;
        System.out.println("++a:" + result);

        a = 3;
        result = (a++) + 1;
        System.out.println("a++:" + result);*/

        /*int a = 6;
        System.out.println(a);
        System.out.println((double) a);*/
    }
}
