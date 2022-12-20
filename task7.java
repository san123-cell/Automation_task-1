
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("first");
        Scanner sc= new Scanner(System.in);
        int first= sc.nextInt();
        System.out.println("second");
        int second= sc.nextInt();
        System.out.println("third");
        int third = sc.nextInt();
        if(first>second && first>third){
            System.out.println("The greatest number is:"+first);
        }
        else if(second > third)
        {
            System.out.println("The greatest number is:"+second);
        }
        else
        {
            System.out.println("The greatest number is:"+third);
        }


    }
}
