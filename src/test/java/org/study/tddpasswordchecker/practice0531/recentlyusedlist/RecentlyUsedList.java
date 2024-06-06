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
        int duplicateIndex = 0;
        for (String element : list) {
            if (element.equals(input)) {
                isDuplicate = true;
                break;
            }
            duplicateIndex++;
        }
        if (isDuplicate) {
            String removed = list.remove(duplicateIndex);
            list.addFirst(removed);
        } else {
            list.addFirst(input);
        }
    }
}
