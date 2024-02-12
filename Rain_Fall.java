import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rain=sc.nextInt();
        if(rain<3){
            System.out.println("LIGHT");
        }
        else if(rain>=3 && rain<7){
            System.out.println("MODERATE");
        }
        else{
            System.out.println("HEAVY");
        }
    }
}