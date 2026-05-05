import java.util.Scanner;
class Imformation{
    private String name;
    private int score1;
    private int score2;
    private int score3;

    public Imformation(String a,int a1,int a2,int a3){
        name=a;
        score1=a1;
        score2=a2;
        score3=a3;

    }
    public int getsum(){
        return score1+score2+score3;
    }
    @Override
    public String toString(){
        return name+" "+score1+" "+score2+" "+score3;
    }
}
public class Leetcode1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Imformation topstudent=null;
        for (int i = 0; i < n; i++) {
            String name=in.next();
            int score1= in.nextInt();
            int score2=in.nextInt();
            int score3=in.nextInt();
            Imformation im=new Imformation(name,score1,score2,score3);
            if (topstudent==null||im.getsum()>topstudent.getsum()){
                topstudent=im;
            }
        }
            System.out.println(topstudent);
    }
}
