import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Hexadecimal Number:");
        String s=sc.next();
        int n=Integer.parseInt(s,16);
        System.out.println(n);
    }
}
