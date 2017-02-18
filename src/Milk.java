import java.util.Date;

/**
 * Created by ugyan on 2017.02.16..
 */
public class Milk {

    private long barCode;
    private final int LITER = 4;
    private final int HALFLITER = 2;
    private final int GLASS = 1;
    private final double WHOLE = 4.0;
    private final double SEMISKIMMED = 2.5;
    private int volume;
    private String manufacturer;
    private Date expiration;
    private double fatContent;
    private long price;

    public Milk(long barCode, int volume, String manufacturer, Date expiration, double fatContent, long price) {
        this.barCode = barCode;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.expiration  = expiration;
        this.fatContent = fatContent;
        this.price = price;

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

    public long getPrice() {
        return price;
    }

    public String toString() { return "Barcode : " + this.getBarCode() + "\n" +
                                      "Volume : " + this.getVolume() + "\n" +
                                      "Manufacturer : " + this.getManufacturer() + "\n" +
                                      "Expiration : " + this.getExpiration() + "\n" +
                                      "Fat content : " + this.getFatContent() + "\n" +
                                      "Price : " + this.getPrice() + "\n";}

}

