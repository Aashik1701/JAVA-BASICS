import java.util.Scanner;

public class DemoWeek
{
    public static void main(String[] args) {
        System.out.print("Enter the week number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        switch(a) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
    }
}