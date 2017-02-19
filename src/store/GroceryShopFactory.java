package store;

import store.goods.Cheese;
import store.goods.Milk;
import store.goods.Soap;
import store.goods.milk.htstMilk;
import store.goods.milk.uhtMilk;
import java.util.Date;

/**
 * Created by ugyan on 2017.02.19..
 */
public abstract class GroceryShopFactory {

    public Milk newUhtMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newuhtMilk = new uhtMilk(barCode, volume, manufacturer, expiration, fatContent);
        return newuhtMilk;
    }

    public Milk newHtstMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newhtstMilk = new htstMilk(barCode, volume, manufacturer, expiration, fatContent);
        return newhtstMilk;
    }

    public Cheese newCheese(double weight, double fatContent, long barCode, String manufacturer, Date expiration) {
        Cheese newCheese = new Cheese(weight, fatContent, barCode, manufacturer, expiration);
        return newCheese;
    }

    public Soap newSoap(long barCode, String manufacturer, char detergentValue) {
        Soap newSoap = new Soap(barCode, manufacturer, detergentValue);
        return newSoap;
    }
}
