import java.util.*;
public class TipCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip Calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        double tipDecimal = (double) tip / 100;
        List<String> i = new ArrayList<>(); // got it from google i dont remeber where
        double total = 0;
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50: ");
        double cost = scan.nextDouble();
        scan.nextLine();
        System.out.print("What was the Item: ");
        String item = scan.nextLine();
        i.add(item);
        total += cost;


        while (cost != -1){
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50: ");
            cost = scan.nextDouble();
            total += cost;
            scan.nextLine();
            if (cost == -1){
                break; // gained from stack overflow
            }
            System.out.print("What was the Item: ");
            item = scan.nextLine();
            i.add(item);
        }
        total ++;
        System.out.print("How much money do you have all together? $");
        double moneyTotal = scan.nextDouble();
        scan.nextLine();


        // I got the Math.round function online on stackoverflow
        double totaltip = (double) Math.round((total * tipDecimal) * 100) / 100;
        double totalbill = (double) Math.round((total + totaltip) * 100) / 100;
        double costBeforeTip = (double) Math.round((total / people) * 100) /100;
        double tipPerPerson = (double) Math.round((totaltip / people) * 100) / 100;
        double totalPerPerson = (double) Math.round((totalbill /people)* 100) /100;
        double change = (double) Math.round((moneyTotal - totalbill)* 100)/100;
        double changePerPerson = (double) Math.round((change / people) * 100)/100;
        System.out.println("----------------------------------------");
        System.out.println("Total bill before tip: " + total);
        System.out.println("Tip Percentage: " + tip + "%");
        System.out.println("Total tip: $" + totaltip);
        System.out.println("Total bill with tip: $" + totalbill);
        System.out.println("Per Person cost before tip: " + costBeforeTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + totalPerPerson);
        System.out.println("Change left: $" + change);
        System.out.println("Change per person: $" + changePerPerson);
        System.out.println("-------------------------------------------");
        System.out.println("Items ordered: ");
        i.forEach(System.out::println); // got from stack overflow

    }
}