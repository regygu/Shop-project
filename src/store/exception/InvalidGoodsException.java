package store.exception;

import store.GroceryShopException;

/**
 * Created by ugyan on 2017.02.19..
 */
public class InvalidGoodsException extends GroceryShopException {

    public InvalidGoodsException(String message) {
        super(message);
    }
}
