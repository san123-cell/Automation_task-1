import java.util.Scanner;
public class task10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        for(int i=1; i <= 10; i++)
        {
            if(a>0){
                System.out.println(a+" * "+i+" = "+a*i);
            }
            else{
                System.out.println("Enter positive number");
                break;
            }

        }
    }
}

