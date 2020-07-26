package snackbar;

public class Main
{
    public static void main(String args[])
    {
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

        System.out.println("Customers:");
        System.out.println(jane.getId() + " - " + jane.getName() + " - " + jane.getCash_On_Hand());
        System.out.println(bob.getId() + " - " + bob.getName() + " - " + bob.getCash_On_Hand());
        System.out.println();

        System.out.println("Vending Machines:");
        System.out.println(food.getId() + " - " + food.getName());
        System.out.println(drink.getId() + " - " + drink.getName());
        System.out.println(office.getId() + " - " + office.getName());
        System.out.println();

        System.out.println("Vending Machines:");
        System.out.println(chips.getId() + " - " + chips.getName() + " - " + chips.getQuantity() + " - " + chips.getCost() + " - " + chips.getVending_Machine_Id());
        System.out.println(chocolate_bar.getId() + " - " + chocolate_bar.getName() + " - " + chocolate_bar.getQuantity() + " - " + chocolate_bar.getCost() + " - " + chocolate_bar.getVending_Machine_Id());
        System.out.println(pretzel.getId() + " - " + pretzel.getName() + " - " + pretzel.getQuantity() + " - " + pretzel.getCost() + " - " + pretzel.getVending_Machine_Id());
        System.out.println(soda.getId() + " - " + soda.getName() + " - " + soda.getQuantity() + " - " + soda.getCost() + " - " + soda.getVending_Machine_Id());
        System.out.println(water.getId() + " - " + water.getName() + " - " + water.getQuantity() + " - " + water.getCost() + " - " + water.getVending_Machine_Id());

    }
}