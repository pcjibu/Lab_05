import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your party affiliation [D,R,I] : ");
        String partyAffiliation = scanner.next();
        switch (partyAffiliation)
        {
            case "D":
                System.out.println("You are a Democrate");
                break;
            case "R":
                System.out.println("You are a Republican");
                break;
            case "I":
                System.out.println("You are a Independent");
                break;
            default:
                System.out.println("You are an Other");
                break;
        }
    }

}
