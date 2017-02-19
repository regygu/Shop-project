import java.util.Hashtable;
import java.util.Random;

/**
 * Created by ugyan on 2017.02.16..
 */
public class GroceryShop {

    private String name;
    private String address;
    private String owner;
    private Hashtable<Long, groceryShopEntry> foodCounter;

    public GroceryShop(String name, String address, String owner, Hashtable foodCounter) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.foodCounter = foodCounter;
    }

    public GroceryShop(String name, String address, String owner) {
        this.name = name;
        this.address = address;
        this.owner = owner;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getOwner() { return owner; }

    public boolean isThereSpecificItem(Class c) { return foodCounter.contains(c); }

    public boolean isThereMilk() { return isThereSpecificItem(Milk.class); }

    public boolean isThereCheese() { return isThereSpecificItem(Cheese.class); }

    public void stockFood(long barCode, long quantity) { foodCounter.get(barCode).addQuantity(quantity); }

    public void stockNewFood(Food food, long quantity, long price) { foodCounter.put(generateBarCode(), new groceryShopEntry(food, quantity, price)); }

    public void deleteFood(long barCode) { foodCounter.remove(barCode); }

    public void buyFood(long barCode, long quantity) { foodCounter.get(barCode).subtractQuantity(quantity);}

    public long generateBarCode() {
        Random randomGen = new Random();
        return randomGen.nextLong();
    }

    class groceryShopEntry {

        private Food food;
        private long quantity;
        private long price;

        public groceryShopEntry(Food food, long quantity, long price) {
            this.food = food;
            this.quantity = quantity;
            this.price = price;
        }

        public Food getFood() { return food; }

        public void setFood(Food food) {
            this.food = food;
        }

        public long getQuantity() { return quantity; }

        public void setQuantity(long quantity) { this.quantity = quantity; }

        public void addQuantity(long quantity) {
            this.quantity += quantity;
        }

        public void subtractQuantity(long quantity) {
            this.quantity -= quantity;
        }

        public long getPrice() { return price; }

        public void setPrice(long price) {
            this.price = price;
        }
    }

}
