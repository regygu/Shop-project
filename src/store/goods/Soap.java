package store.goods;

import store.Goods;

/**
 * Created by ugyan on 2017.02.19..
 */
public class Soap extends Goods {
    protected long barCode;
    protected String manufacturer;
    protected char detergentValue;

    public Soap(long barCode, String manufacturer, char detergentValue) {
        this.barCode = barCode;
        this.manufacturer = manufacturer;
        this.detergentValue = detergentValue;

    }
}
