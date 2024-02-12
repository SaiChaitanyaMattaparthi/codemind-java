import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bs=sc.nextInt();
        double da,hra;
        if(bs<=10000){
            da=0.8*bs;
            hra=0.2*bs;
        }
        else if(bs<=20000){
            da=0.9*bs;
            hra=0.25*bs;
        }
        else{
            da=0.95*bs;
            hra=0.30*bs;
        }
        double gs=bs+da+hra;
        System.out.printf("%.2f",gs);
    }
}