package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String[][] Ccity = new String[2][2];

        String[] Country = {"France", "Sweden"};

        String[] City = {"Paris", "Stockholm"};

        Ccity[0][0] = Country[0];
        Ccity[1][0] = Country[1];
        Ccity[0][1] = City[0];
        Ccity[1][1] = City[1];

        for (int i = 0; i < Ccity.length; i++) {
            for (int j = 0; j < Ccity[i].length; j++) {
                System.out.println(Ccity[i][j]);

                if (j == Ccity[i].length -1) {
                    System.out.println();
                }
                }
            }
        }


    }

