import java.util.Vector;

/**
 * Created by ugyan on 2017.02.16..
 */
public class GroceryShop {

    private String name;
    private String address;
    private String owner;
    private Vector<Milk> milkCounter;
    private int flag;

    public GroceryShop(String name, String address, String owner, Vector<Milk> milkCounter) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.milkCounter = milkCounter;
    }

    public GroceryShop(String name, String address, String owner) {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getOwner() { return owner; }

    public boolean isThereMilk() { return !milkCounter.isEmpty(); }

    public Milk buyMilk(Milk milk) {
        for (Milk milkElement : milkCounter) {
            if (milkElement.equals(milk)) {
                milkCounter.remove(milkElement);
            return milkElement;
            }
        }
    }

    public void stockMilk(Milk milk) {
        milkCounter.add(milk);
    }
}
