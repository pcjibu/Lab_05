import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first number?: ");
        int firstNum = scanner.nextInt();
        System.out.print("What is your second number?: ");
        int secNum = scanner.nextInt();
        if (firstNum == secNum)
        {
            System.out.println("They are equal");
        }
        if (firstNum > secNum)
        {
            System.out.println("The " + secNum + " is smaller ");
        }
        if (firstNum < secNum)
        {
            System.out.println("The " + firstNum + " is smaller ");
        } else
        {
            System.out.println(" You entered the wrong input ");
        }

    }

}
