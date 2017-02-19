package milk;

import java.util.Date;

/**
 * Created by ugyan on 2017.02.18..
 */

// HTST - standing for High Temperature / Short Time pasteurization

public class htstMilk extends Milk {

    public htstMilk(long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        super(barCode, volume, manufacturer, expiration, fatContent);
    }
}
