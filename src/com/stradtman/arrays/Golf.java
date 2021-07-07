package com.stradtman.arrays;

import java.util.Arrays;

public class Golf {
    public static void main(String[] args) {
        String[] friends = {"Kevin", "Patrick", "John", "Mike"};
        int[][] scoreCards = {
                {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
                {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
                {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2},
                {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2}
        };
//        System.out.println(scoreCards.length);
//        System.out.println(Arrays.toString(scoreCards[0]));
//        System.out.println(scoreCards[1][3]);
//        System.out.println(scoreCards[2][14]);

        for (int i = 0; i < friends.length; i++) {
            System.out.printf("%s %n ----------------------- %n", friends[i]);
            for (int j = 0; j < scoreCards[i].length; j++) {
                System.out.printf("Hole #%d: %d %n", j + 1, scoreCards[i][j]);
            }
        }
    }
}
