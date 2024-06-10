package org.study.tddpasswordchecker.kim.string;

import java.util.Arrays;

public class ShortestDistance {

    public String getEachDistances(String input, char target) {
        int[] distanceArray = populateDistanceArray(input, target);
        return getResult(distanceArray);
    }

    private int[] populateDistanceArray(String input, char target) {
        int[] distanceArray = new int[input.length()];
        Arrays.fill(distanceArray, Integer.MAX_VALUE);
        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            for (int j = i; j < input.length(); j++) {
                if (input.charAt(j) == target) {
                    distanceArray[i] = Math.min(distanceArray[i], count);
                }
                count++;
            }
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            int count = 0;
            for (int j = i; j >= 0; j--) {
                if (input.charAt(j) == target) {
                    distanceArray[i] = Math.min(distanceArray[i], count);
                }
                count++;
            }
        }
        return distanceArray;
    }

    private String getResult(int[] distanceArray) {
        String result = "";
        for (int i : distanceArray) {
            if (result.equals("")) {
                result += i;
            } else {
                result += " " + i;
            }
        }
        return result;
    }
}
