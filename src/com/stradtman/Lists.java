package com.stradtman;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Kevin");
        groceryLine.add("Beth");
        groceryLine.add("Sam");
        System.out.println(groceryLine);
        groceryLine.remove(1);
        System.out.println(groceryLine);
        String kevin = groceryLine.get(0);
        System.out.println(kevin);
    }
}
