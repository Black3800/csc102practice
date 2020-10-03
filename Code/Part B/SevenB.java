public class SevenB {
    public static void main(String[] args) {
        int j = 1;
        int k = 1;
        int n = 4;
        int arr[] = new int[n*(n+1)/2];
        for(int i=0; i<n*(n+1)/2; i++)
        {
            arr[i] = j++;
            if(j > k)
            {
                j = 1;
                k++;
            }
        }
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
}
