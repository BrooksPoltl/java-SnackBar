package snackBar;

public class Main
{
    private static void workWithData()
    {
        //customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        //food
        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        //drink
        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);

        System.out.println("*** Query Data\n");
// Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        jane.buy(3*soda.getCost());
        soda.buySnack(3);
        System.out.println(jane.getCoh());
        System.out.println(soda.getQuantity());
// Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        jane.buy(pretzel.getCost());
        pretzel.buySnack(1);
        System.out.println(jane.getCoh());
        System.out.println(pretzel.getQuantity());
// Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        bob.buy(2* soda.getCost());
        soda.buySnack(2);
        System.out.println(bob.getCoh());
        System.out.println(soda.getQuantity());
// Customer 1 finds $10. Print Customer 1 Cash on Hand.
        jane.addCash(10);
        System.out.println(jane.getCoh());
// Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        jane.buy(chocolateBar.getCost());
        chocolateBar.buySnack(1);
        System.out.println(jane.getCoh());
        System.out.println(chocolateBar.getQuantity());
// Add 12 more items to snack 3. Print quantity of snack 3.
        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());
// Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        bob.buy(3* pretzel.getCost());
        pretzel.buySnack(3);
        System.out.println(bob.getCoh());
        System.out.println(pretzel.getQuantity());

        //response 
        // 37.75
        // 21
        // 35.75
        // 29
        // 28.14
        // 19
        // 45.75
        // 44.75
        // 35
        // 41
        // 22.14
        // 38

    }
    public static void main(String[] args)
    {
        workWithData();
    }
}