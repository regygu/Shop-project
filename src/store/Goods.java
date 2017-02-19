package store;

/**
 * Created by ugyan on 2017.02.19..
 */
public abstract class Goods {
    protected long barCode;
    protected String manufacturer;

    public Goods(long barCode, String manufacturer) {
        this.barCode = barCode;
        this.manufacturer = manufacturer;
    }
}
