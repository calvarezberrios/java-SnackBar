package snackbar;

public class Snack
{
    public static int maxId = 0;
    private int id;
    private String name;
    private int quantity = 0;
    private double cost;
    private int vending_machine_id;

    public Snack(String name)
    {
        this.id = ++maxId;
        this.name = name;
    }

    public Snack(String name, int quantity, double cost, VendingMachine vendingMachine)
    {
        this.id = ++maxId;
        this.name = name;
        this.quantity += quantity;
        this.cost = cost;
        this.vending_machine_id = vendingMachine.getId();
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVending_Machine_Id()
    {
        return vending_machine_id;
    }

    public void setVending_machine_id(int vending_machine_id)
    {
        this.vending_machine_id = vending_machine_id;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addSnacks(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    public double getTotal(int quantity)
    {
        return cost * quantity;
    }

}