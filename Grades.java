import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int totalmarks=a+b+c+d+e;
        double percentage=(double)totalmarks/5;
        if(percentage>=90)
        System.out.println("Grade A");
        else if(percentage>=80)
        System.out.println("Grade B");
        else if(percentage>=70)
        System.out.println("Grade C");
        else if(percentage>=60)
        System.out.println("Grade D");
        else if(percentage>=40)
        System.out.println("Grade E");
        else
        System.out.println("Grade F");
    }
}