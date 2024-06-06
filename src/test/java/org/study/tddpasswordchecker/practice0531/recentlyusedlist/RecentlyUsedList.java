package org.study.tddpasswordchecker.practice0531.recentlyusedlist;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    private List<String> list = new ArrayList<>();
    public List<String> getList() {
        return list;
    }

    public void add(String input) {
        boolean isDuplicate = false;
        for (String element : list) {
            if (element.equals(input)) {
                isDuplicate = true;
            }
        }
        if (!isDuplicate) {
            list.addFirst(input);
        }
    }
}
