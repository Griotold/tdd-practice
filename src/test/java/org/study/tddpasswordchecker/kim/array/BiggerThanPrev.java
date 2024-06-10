package org.study.tddpasswordchecker.kim.array;

import java.util.ArrayList;
import java.util.List;

public class BiggerThanPrev {
    public String filter(int ea, String input) {
        int[] intArray = new int[ea];
        initializeArray(ea, input, intArray);
        List<Integer> answerList = initializeAnswerList(intArray);

        biggerThanPrevThenAdd(ea, intArray, answerList);

        return getResult(answerList);
    }

    private static void biggerThanPrevThenAdd(int ea, int[] intArray, List<Integer> answerList) {
        for (int i = 1; i < ea; i++) {
            if (intArray[i - 1] < intArray[i]) {
                answerList.add(intArray[i]);
            }
        }
    }

    private static List<Integer> initializeAnswerList(int[] intArray) {
        List<Integer> answerList = new ArrayList<>();
        answerList.add(intArray[0]);
        return answerList;
    }

    private void initializeArray(int ea, String input, int[] intArray) {
        String[] split = input.split(" ");
        for (int i = 0; i < ea; i++) {
            intArray[i] = Integer.parseInt(split[i]);
        }
    }

    private String getResult(List<Integer> answerList) {
        String result = "";
        for (int num : answerList) {
            if (result.equals("")) result += num;
            else result += " " + num;
        }
        return result;
    }
}
