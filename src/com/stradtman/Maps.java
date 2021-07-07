package com.stradtman;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "Waffles");
        meals.put(LUNCH, "Ham");
        meals.put(DINNER, "Salad");

        System.out.println(meals);
        System.out.println(meals.get(DINNER));
        String lunch = meals.remove(LUNCH);
        boolean hasLunch = meals.containsKey(LUNCH);
        boolean hasHam = meals.containsValue("Ham");
        int size = meals.size();
        System.out.println(lunch + " " + hasLunch + " " + hasHam + " " + size);
    }
}
