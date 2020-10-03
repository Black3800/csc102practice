class Flower {
    String type;
    int count;
    static int totalFlowers;

    public void setType(String s) {
        type = s;
    }

    public void setCount(int c) {
        count = c;
        totalFlowers += c;
    }

    public void report() {
        System.out.println("There are " + totalFlowers + " flowers in total.");
        System.out.println(count + " of them are " + type);
    }
}

public class TenB {
    public static void main(String[] args) {
        Flower r = new Flower();
        Flower d = new Flower();
        r.setType("Roses");
        r.setCount(12);
        d.setType("Daisies");
        d.setCount(21);
        r.report();
    }
}
