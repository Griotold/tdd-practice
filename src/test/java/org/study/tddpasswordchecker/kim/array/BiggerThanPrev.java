package org.study.tddpasswordchecker.kim.array;

public class BiggerThanPrev {
    public String filter(int ea, String input) {
        int[] intArray = new int[ea];
        initializeArray(ea, input, intArray);

        for (int i = 1; i < ea; i++) {
            if (intArray[i - 1] > intArray[i]) {
                intArray[i] = 0;
            }
        }

        return getResult(intArray);
    }

    private void initializeArray(int ea, String input, int[] intArray) {
        String[] split = input.split(" ");
        for (int i = 0; i < ea; i++) {
            intArray[i] = Integer.parseInt(split[i]);
        }
    }

    private String getResult(int[] intArray) {
        String result = "";
        for (int num : intArray) {
            if (num > 0) {
                if (result.equals("")) result += num;
                else result += " " + num;
            }
        }
        return result;
    }
}
