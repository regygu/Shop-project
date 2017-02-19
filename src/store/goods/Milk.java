package store.goods;

import java.util.Date;

/**
 * Created by ugyan on 2017.02.16..
 */
public abstract class Milk extends Food {

    public final int LITER = 4;
    public final int HALFLITER = 2;
    public final int GLASS = 1;
    public final double WHOLE = 4.0;
    public final double SEMISKIMMED = 2.5;
    protected long barCode;
    protected int volume;
    protected String manufacturer;
    protected Date expiration;
    protected double fatContent;

    public Milk(long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        super(barCode, manufacturer, expiration);
        this.volume = volume;
        this.fatContent = fatContent;

    }

    public boolean isItFresh() {
        Date currentDate = new Date();
        if (currentDate.after(this.expiration)) {
            return false;
        }
        return true;
    }

    public long getBarCode() { return barCode; }

    public int getVolume() {
        return volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Date getExpiration() {
        return expiration;
    }

    public double getFatContent() {
        return fatContent;
    }

    public String toString() { return "Barcode : " + this.getBarCode() + "\n" +
                                      "Volume : " + this.getVolume() + "\n" +
                                      "Manufacturer : " + this.getManufacturer() + "\n" +
                                      "Expiration : " + this.getExpiration() + "\n" +
                                      "Fat content : " + this.getFatContent() + "\n"; }

}

