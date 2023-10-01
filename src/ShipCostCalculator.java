import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the price of your item?: ");
        double itemPrice = scanner.nextDouble();
        double shippingCost = (itemPrice >= 100) ? 0: (0.02 * itemPrice);
        double totalPrice = (itemPrice + shippingCost);
        System.out.print(" Your item price was  " + itemPrice + " and your shipping cost ended up being " + shippingCost + " in total you must pay " + totalPrice);
        scanner.close();
    }
}
