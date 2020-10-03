public class Three {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(0, 4).toUpperCase().concat(s.substring(13)));
        System.out.println(s.substring(0, 4).concat(s.substring(13).toUpperCase()));
        System.out.println(s.substring(0, 4).toUpperCase() + s.substring(13).toLowerCase());
        System.out.println("JAVAing");
    }
}
