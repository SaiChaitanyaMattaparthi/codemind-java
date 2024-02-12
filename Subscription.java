import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int duration=sc.nextInt();
        if(duration>40){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}