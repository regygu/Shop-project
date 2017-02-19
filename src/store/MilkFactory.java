package store;

import store.goods.Milk;
import store.goods.milk.htstMilk;
import store.goods.milk.uhtMilk;

import java.util.Date;

/**
 * Created by ugyan on 2017.02.19..
 */
public abstract class MilkFactory {

    public Milk newUhtMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newuhtMilk = new uhtMilk(barCode, volume, manufacturer, expiration, fatContent);
        return newuhtMilk;
    }

    public Milk newHtsttMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newhtstMilk = new htstMilk(barCode, volume, manufacturer, expiration, fatContent);
        return newhtstMilk;
    }
}
