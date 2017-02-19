package store.exception;

import store.GroceryShopException;

/**
 * Created by ugyan on 2017.02.19..
 */
public class TooMuchReductionException extends GroceryShopException {

    public TooMuchReductionException(String message) {
        super(message);
    }
}
