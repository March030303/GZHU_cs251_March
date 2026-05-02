import java.util.Scanner;
public class Array2 {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int[] b=new int[n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i]>a[j]){
                    b[i]++;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
