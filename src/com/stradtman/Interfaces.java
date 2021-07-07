package com.stradtman;

public class Interfaces {
    public static void main(String[] args) {
// Create Objects
        ShopKeeper shopKeeper = new ShopKeeper("Larry");
        Teacup teacup = new Teacup();
        String treehouse = "Treehouse";

// Loop through Objects
        Object[] objects = {shopKeeper, teacup, treehouse};

        for (Object object : objects) {
            if (object instanceof Chattable) {
                String response = ((Chattable) object).chat();
                System.out.println(response);
            }
        }

// Loop through Chattables
        Chattable[] chattables = {shopKeeper, teacup};

        for (Chattable chattable : chattables) {
            String response = chattable.chat();
            System.out.println(response);
        }
    }
}
