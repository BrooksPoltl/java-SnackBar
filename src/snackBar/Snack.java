package snackBar;

public class Snack
{
    private int id;
    private static int maxId = 0;
    private String name;
    public double cost;
    private int quantity;
    private int vendingMachineID;

    public Snack(String name, int quantity,double cost, int vendingMachineID)
    {
        maxId++;
        this.id = maxId;
        this.cost = cost;
        this.name = name;
        this.quantity = quantity;
        this.vendingMachineID = vendingMachineID;

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

    public int getVendingMachineID()
    {
        return vendingMachineID;
    }
    public void setVendingMachineID(int id)
    {
        this.vendingMachineID = id;
    }

    public int getQuantity()
    {
        return quantity;
    }
    public void addQuantity(int amt)
    {
        int total = amt + getQuantity();
        this.quantity = total;
    }

    public void buySnack(int amt)
    {
        int total = getQuantity()-amt;
        this.quantity = total;
    }
    
    public double getTotalCost(int quant)
    {
        double total = quant * getCost();
        return total;
    }

}