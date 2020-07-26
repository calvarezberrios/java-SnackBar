package snackbar;

public class Customer
{
    public static int maxId = 0;
    private int id;

    private String name;
    private double cash_on_hand = 0.00;

    public Customer(String name)
    {
        this.id = ++maxId;
        this.name = name;
    }

    public Customer(String name, double cash_on_hand)
    {
        this.id = ++maxId;
        this.name = name;
        this.cash_on_hand += cash_on_hand;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCash_On_Hand()
    {
        return cash_on_hand;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double cash_on_hand)
    {
        this.cash_on_hand += cash_on_hand;
    }

    public void buySnacks(double total)
    {
        this.cash_on_hand -= total;
    }
}