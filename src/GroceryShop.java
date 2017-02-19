import java.util.Hashtable;
import java.util.Map;

/**
 * Created by ugyan on 2017.02.16..
 */
public class GroceryShop {

    private String name;
    private String address;
    private String owner;
    private Hashtable<Long, Milk> milkCounter;

    public GroceryShop(String name, String address, String owner, Hashtable milkCounter) {
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

    public Milk buyMilk(long barCode) {
        while (milkCounter.entrySet().iterator().hasNext()) {
            Map.Entry<Long, Milk> entry = milkCounter.entrySet().iterator().next();
            if (entry.getKey().equals(barCode)) {
                milkCounter.remove(barCode);
                return entry.getValue();
            }
        }
        return null;
    }

    public void stockMilk(Milk milk) {
        milkCounter.put(milk.getBarCode(), milk);
    }


    class groceryShopEntry {

        private Milk milk;
        private int quantity;
        private int price;

        public groceryShopEntry(Milk milk, int quantity, int price) {
            this.milk = milk;
            this.quantity = quantity;
            this.price = price;
        }

        public Milk getMilk() { return milk; }

        public void setMilk(Milk milk) {
            this.milk = milk;
        }

        public int getQuantity() { return quantity; }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void addQuantity(int quantity) {
            this.quantity += quantity;
        }

        public void subtractQuantity(int quantity) {
            this.quantity -= quantity;
        }

        public int getPrice() { return price; }

        public void setPrice(int price) {
            this.price = price;
        }
    }

}
