package snackbar;

import java.text.DecimalFormat;

public class Main
{
    public static void main(String args[])
    {
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food);
        Snack chocolate_bar = new Snack("Chocolate Bar", 36, 1.00, food);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food);
        Snack soda = new Snack("Soda", 24, 2.50, drink);
        Snack water = new Snack("Water", 20, 2.75, drink);

        if(soda.getQuantity() >= 3 && jane.getCash_On_Hand() >= soda.getTotal(3))
        {
            jane.buySnacks(soda.getTotal(3));
            soda.buySnack(3);
            System.out.println("Customer " + jane.getId() + " cash on hand " + df.format(jane.getCash_On_Hand()));
            System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());
        }
        else if(soda.getQuantity() < 3)
        {
            System.out.println("There is " + soda.getQuantity() + " in stock.");
        }
        else
        {
            System.out.println("Jane does not have enough cash on hand. Cash on Hand: " + df.format(jane.getCash_On_Hand()));
        }
        System.out.println();

        System.out.println();
        if(pretzel.getQuantity() >= 1 && jane.getCash_On_Hand() >= pretzel.getTotal(1))
        {
            jane.buySnacks(pretzel.getTotal(1));
            pretzel.buySnack(1);
            System.out.println("Customer " + jane.getId() + " cash on hand " + df.format(jane.getCash_On_Hand()));
            System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
        }
        else if(pretzel.getQuantity() < 1)
        {
            System.out.println("There is " + pretzel.getQuantity() + " in stock.");
        }
        else
        {
            System.out.println("Jane does not have enough cash on hand. Cash on Hand: " + df.format(jane.getCash_On_Hand()));
        }
        System.out.println();

        System.out.println();
        if(soda.getQuantity() >= 2 && bob.getCash_On_Hand() >= soda.getTotal(2))
        {
            bob.buySnacks(soda.getTotal(2));
            soda.buySnack(2);
            System.out.println("Customer " + bob.getId() + " cash on hand " + df.format(bob.getCash_On_Hand()));
            System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());
        }
        else if(soda.getQuantity() < 2)
        {
            System.out.println("There is " + soda.getQuantity() + " in stock.");
        }
        else
        {
            System.out.println("Bob does not have enough cash on hand. Cash on Hand: " + df.format(bob.getCash_On_Hand()));
        }
        System.out.println();

        System.out.println();
        jane.addCash(10.00);
        System.out.println("Customer " + jane.getId() + " cash on hand " + df.format(jane.getCash_On_Hand()));
        System.out.println();

        System.out.println();
        if(chocolate_bar.getQuantity() >= 1 && jane.getCash_On_Hand() >= chocolate_bar.getTotal(1))
        {
            jane.buySnacks(chocolate_bar.getTotal(1));
            chocolate_bar.buySnack(1);
            System.out.println("Customer " + jane.getId() + " cash on hand " + df.format(jane.getCash_On_Hand()));
            System.out.println("Quantity of snack " + chocolate_bar.getId() + " is " + chocolate_bar.getQuantity());
        }
        else if(chocolate_bar.getQuantity() < 1)
        {
            System.out.println("There is " + chocolate_bar.getQuantity() + " in stock.");
        }
        else
        {
            System.out.println("Jane does not have enough cash on hand. Cash on Hand: " + df.format(jane.getCash_On_Hand()));
        }
        System.out.println();

        System.out.println();
        pretzel.addSnacks(12);
        System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
        System.out.println();

        System.out.println();
        if(pretzel.getQuantity() >= 3 && bob.getCash_On_Hand() >= pretzel.getTotal(3))
        {
            bob.buySnacks(pretzel.getTotal(3));
            pretzel.buySnack(3);
            System.out.println("Customer " + bob.getId() + " cash on hand " + df.format(bob.getCash_On_Hand()));
            System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
        }
        else if(pretzel.getQuantity() < 3)
        {
            System.out.println("There is " + pretzel.getQuantity() + " in stock.");
        }
        else
        {
            System.out.println("Bob does not have enough cash on hand. Cash on Hand: " + df.format(bob.getCash_On_Hand()));
        }
        System.out.println();

        System.out.println();
        System.out.println("Stretch Goals");
        System.out.println();

        System.out.println();
        System.out.println(
            "Snack: " + chips.getName() + "\n" +
            "Vending Machine: " + food.getName() + "\n" +
            "Quantity: " + chips.getQuantity() + "\n" +
            "Total Cost: " + df.format(chips.getTotal(chips.getQuantity()))
        );
        System.out.println();

        System.out.println();
        System.out.println(
            "Snack: " + chocolate_bar.getName() + "\n" +
            "Vending Machine: " + food.getName() + "\n" +
            "Quantity: " + chocolate_bar.getQuantity() + "\n" +
            "Total Cost: " + df.format(chocolate_bar.getTotal(chocolate_bar.getQuantity()))
        );
        System.out.println();

        System.out.println();
        System.out.println(
            "Snack: " + pretzel.getName() + "\n" +
            "Vending Machine: " + food.getName() + "\n" +
            "Quantity: " + pretzel.getQuantity() + "\n" +
            "Total Cost: " + df.format(pretzel.getTotal(pretzel.getQuantity()))
        );
        System.out.println();

        System.out.println();
        System.out.println(
            "Snack: " + soda.getName() + "\n" +
            "Vending Machine: " + drink.getName() + "\n" +
            "Quantity: " + soda.getQuantity() + "\n" +
            "Total Cost: " + df.format(soda.getTotal(soda.getQuantity()))
        );
        System.out.println();

        System.out.println();
        System.out.println(
            "Snack: " + water.getName() + "\n" +
            "Vending Machine: " + drink.getName() + "\n" +
            "Quantity: " + water.getQuantity() + "\n" +
            "Total Cost: " + df.format(water.getTotal(water.getQuantity()))
        );
        System.out.println();


    }
}