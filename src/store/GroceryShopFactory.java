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

    public Milk newSemiSkimmedUhtMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newSemiSkimmedUhtMilk = new uhtMilk(barCode, volume, manufacturer, expiration, Milk.SEMISKIMMED);
        return newSemiSkimmedUhtMilk;
    }

    public Milk newWholeUhtMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newWholeUhtMilk = new uhtMilk(barCode, volume, manufacturer, expiration, Milk.WHOLE);
        return newWholeUhtMilk;
    }

    public Milk newSemiSkimmedHtstMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newSemiSkimmedHtstMilk = new htstMilk(barCode, volume, manufacturer, expiration, Milk.SEMISKIMMED);
        return newSemiSkimmedHtstMilk;
    }

    public Milk newWholeHtstMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newWholeHtstMilk = new htstMilk(barCode, volume, manufacturer, expiration, Milk.WHOLE);
        return newWholeHtstMilk;
    }

    public Milk newSemiSkimmedUhtLiterMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newSemiSkimmedUhtLiterMilk = new uhtMilk(barCode, Milk.LITER, manufacturer, expiration, Milk.SEMISKIMMED);
        return newSemiSkimmedUhtLiterMilk;
    }

    public Milk newWholeUhtLiterMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newWholeUhtLiterMilk = new uhtMilk(barCode, Milk.LITER, manufacturer, expiration, Milk.WHOLE);
        return newWholeUhtLiterMilk;
    }

    public Milk newSemiSkimmedHtstLiterMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newSemiSkimmedHtstLiterMilk = new htstMilk(barCode, Milk.LITER, manufacturer, expiration, Milk.SEMISKIMMED);
        return newSemiSkimmedHtstLiterMilk;
    }

    public Milk newWholeHtstLiterMilk(Long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        Milk newWholeHtstLiterMilk = new htstMilk(barCode, Milk.LITER, manufacturer, expiration, Milk.WHOLE);
        return newWholeHtstLiterMilk;
    }

    public Soap newGradeASoap(Long barCode, String manufacturer) {
        Soap newGradeASoap = new Soap(barCode, manufacturer, 'A');
        return newGradeASoap;
    }



}
