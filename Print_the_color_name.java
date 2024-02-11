import java.util.Scanner;
public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char color=sc.next().charAt(0);
        if(color=='V' ||color=='v')
            System.out.println("Violet");
        else if(color=='I'||color=='i')
            System.out.println("Indigo");
        else if(color=='B'||color=='b')
            System.out.println("Blue");
        else if(color=='G'||color=='g')
            System.out.println("Green");
        else if(color=='Y'||color=='y')
            System.out.println("Yellow");
        else if(color=='O'||color=='o')
            System.out.println("Orange");
        else if(color=='R'||color=='r')
            System.out.println("Red");
        else{
            System.out.println(-1);
        }
    }
}