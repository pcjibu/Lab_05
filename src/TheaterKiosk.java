import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        if (age >= 21)
        {
            System.out.println("You get a wrist band ");
        }
    }
}
