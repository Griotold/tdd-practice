package org.study.tddpasswordchecker.kim.array;

import java.util.ArrayList;
import java.util.List;

public class VisibleStudents {
    public int retrieveStudentsCount(String input) {
        String[] split = input.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String num : split) {
            list.add(Integer.parseInt(num));
        }
        int max = 0;
        int count = 0;
        for (int num :list){
            if (num > max){
                count++;
                max = num;
            }
        }
        return count;
    }
}
