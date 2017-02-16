import java.util.Date;

/**
 * Created by ugyan on 2017.02.16..
 */
public class Milk {

    private int volume;
    private String manufacturer;
    private Date expiration;
    private double fatContent;
    private long price;

    public Milk(int volume, String manufacturer, Date expiration, double fatContent, long price) {
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

}