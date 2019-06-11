package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double coh;
    
    public Customer(String name, double coh)
    {
        maxId++;
        this.id = maxId;
        this.coh = coh;
        this.name = name;
    }

    public double getCoh()
    {
        return coh;
    }

    public void addCash(double cash)
    {
        double total;
        total = getCoh() + cash;
        this.coh = total;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name =name;
    }

    public void buy(double cost)
    {
        double result;
        result = getCoh() - cost;
        if(result >= 0)
        {
            this.coh = result;
        }
        
    }
}