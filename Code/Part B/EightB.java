public class EightB {
    public static void main(String[] args) {
        char[] secret = {'j', 'p', 'r', 'w', 'i', 'z', 'p', 'y'};
        int[] password = {1, 4, 3};
        for(int i=0; i<8; i++)
        {
            secret[i] -= (i == 5) ? password[0] : password[i % 3];
        }
        System.out.print(secret);
    }
}
