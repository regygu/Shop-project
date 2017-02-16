import static java.util.Arrays.asList;

/**
 * Created by ugyan on 2017.02.16..
 */
public class GroceryShop {

    private String name;
    private String address;
    private String owner;
    private Milk[] milkCounter;
    private int flag;

    public GroceryShop(String name, String address, String owner, Milk[] milkCounter) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.milkCounter = milkCounter;

    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getOwner() { return owner; }

    public boolean isThereMilk() { return milkCounter.length > 0; }

    public Milk buyMilk(Milk milk) {
        final int milkCounterLength = milkCounter.length;
        final int indexOfMilk = asList(milkCounter).indexOf(milk);
        Milk[] upToDateMilkCounter = new Milk[milkCounterLength - 1];
        System.arraycopy(milkCounter, 0, upToDateMilkCounter, 0, milkCounterLength);
        System.arraycopy(milkCounter,  indexOfMilk + 1, upToDateMilkCounter, indexOfMilk, milkCounterLength - indexOfMilk - 1);
        milkCounter = upToDateMilkCounter;
        return milk;
    }

}
