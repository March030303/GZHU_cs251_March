import java.util.Scanner;
import java.util.Random;
public class Random_array {
    public static void main(String[] args) {
        //初始化一个数组
        //录入
        //遍历后，随机索引，然后交换
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第" + (i + 1) + "个学生的学号");
            arr[i]=in.nextInt();
            
        }
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个同学打乱后的学号是" + arr[i]);

        }

    }
}
