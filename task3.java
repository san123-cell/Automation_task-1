import java.util.Scanner;

public class task3
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("first");
        int a= sc.nextInt();
        System.out.print("second");
        int b= sc.nextInt();
        int d=a+b;
        int e=a-b;
        int f=a*b;
        System.out.println("sum= " +d);
        System.out.println("dif= " +e);
        System.out.println("mul= " +f);
    }
}
