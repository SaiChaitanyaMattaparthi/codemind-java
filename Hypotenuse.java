import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double hyp=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("%.2f",hyp);
    }
}