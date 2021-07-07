package com.stradtman.arrays;

public class Explore {
    public static void main(String[] args) {
        String[] friends = {"Kevin", "Patrick", "John", "Mike"};
        for (String friend : friends) {
            System.out.printf("Hey %s! The movie starts at 7, see you there! %n", friend);
        }

        System.out.println("----------------------------------------");

        for (int i =  0; i < friends.length; i++) {
            String friend = friends[i];
            System.out.printf("Hey %s! The movie starts at 7, see you there! %n", friend);
        }

        System.out.println("----------------------------------------");

        int[] kevinsScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        for (int i = 0; i < kevinsScoreCard.length; i++) {
            System.out.printf("Hole #%d: %d %n", i + 1, kevinsScoreCard[i]);
        }
    }
}
