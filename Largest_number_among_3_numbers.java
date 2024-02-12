import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ln=a;
        if(b>ln){
           ln=b;
        }
        if(c>ln){
            ln=c;
        }
            System.out.print(ln);
    }
}