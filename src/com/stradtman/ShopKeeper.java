package com.stradtman;

public class ShopKeeper extends Person implements Seller {
    public ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi I am a ShopKeeper";
    }

    @Override
    public String sellGoods() {
        return "This will be $xx.xx for the amount.";
    }
}
