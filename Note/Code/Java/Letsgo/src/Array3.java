import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        boolean istarget=true;
        int[][] arr=new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
                if(arr[i][j]!=0&&i>j){
                    istarget=false;
                }
            }
        }
        if(istarget) System.out.println("YES");
        else System.out.println("NO");
    }
}
