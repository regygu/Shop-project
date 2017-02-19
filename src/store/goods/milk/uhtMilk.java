package store.goods.milk;

import store.goods.Milk;

import java.util.Date;

/**
 * Created by ugyan on 2017.02.18..
 */

// UHT - standing for Ultra High Temperature pasteurization

public class uhtMilk extends Milk {

    public uhtMilk(long barCode, int volume, String manufacturer, Date expiration, double fatContent) {
        super(barCode, volume, manufacturer, expiration, fatContent);
    }
}
