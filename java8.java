import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int day = sc.nextInt();

        System.out.println(dn(day));
    }
    public static String dn(int day) {
        String name = "";
        switch (day) {
            case 1: name = "Monday"; break;
            case 2: name = "Tuesday"; break;
            case 3: name = "Wednesday"; break;
            case 4: name = "Thursday"; break;
            case 5: name = "Friday"; break;
            case 6: name = "Saturday"; break;
            case 7: name = "Sunday"; break;
            default:name = "this is not in a week range";
        }

        return name;
    }
}

