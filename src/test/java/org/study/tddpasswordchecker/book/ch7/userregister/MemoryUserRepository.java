package org.study.tddpasswordchecker.book.ch7.userregister;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository{

    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public boolean isExist(String id) {
        return users.get(id) != null;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }
}
