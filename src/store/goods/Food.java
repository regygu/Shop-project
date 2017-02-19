package store.goods;

import store.Goods;

import java.util.Date;

/**
 * Created by ugyan on 2017.02.19..
 */
public class Food extends Goods {
    protected long barCode;
    protected String manufacturer;
    protected Date expiration;

    public Food(long barCode, String manufacturer, Date expiration) {
        this.barCode = barCode;
        this.manufacturer = manufacturer;
        this.expiration = expiration;
    }

    public long getBarCode() { return barCode; }

    public boolean isItFresh() {
        Date currentDate = new Date();
        if (currentDate.after(this.expiration)) {
            return false;
        }
        return true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Date getExpiration() {
        return expiration;
    }

    public String toString() { return "Barcode : " + this.getBarCode() + "\n" +
            "Manufacturer : " + this.getManufacturer() + "\n" +
            "Expiration : " + this.getExpiration() + "\n"; }

}
