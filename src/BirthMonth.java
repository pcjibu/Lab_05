import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your birth month? ");
        int birthMonth = scanner.nextInt();
        if (birthMonth >= 1 & birthMonth <= 12)
        {
            System.out.println("Your birth month is " + birthMonth);
        }else
        {
            System.out.println(" You entered the wrong intiger");
        }
        scanner.close();
    }

}
