import java.util.Date;

/**
 * Created by ugyan on 2017.02.19..
 */
public class Cheese {
    protected double weight;
    protected double fatContent;
    protected long barCode;
    protected String manufacturer;
    protected Date expiration;

    public Cheese(double weight, double fatContent, long barCode, String manufacturer, Date expiration) {
        this.weight = weight;
        this.fatContent = fatContent;
        this. barCode = barCode;
        this.manufacturer = manufacturer;
        this.expiration = expiration;
    }

    public double getWeight() { return weight; }

    public double getFatContent() { return fatContent; }

    public long getBarCode() { return barCode; }

    public String getManufacturer() { return manufacturer; }

    public Date getExpiration() { return expiration; }

    public boolean isItFresh() {
        Date currentDate = new Date();
        if (currentDate.after(this.expiration)) {
            return false;
        }
        return true;
    }

    public String toString() { return "Barcode : " + this.getBarCode() + "\n" +
            "Weight : " + this.getWeight() + "\n" +
            "Manufacturer : " + this.getManufacturer() + "\n" +
            "Expiration : " + this.getExpiration() + "\n" +
            "Fat content : " + this.getFatContent() + "\n"; }
}


