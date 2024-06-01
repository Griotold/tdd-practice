package org.study.tddpasswordchecker.book.ch7.userregister;

public interface UserRepository {

    void save(User user);

    boolean isExist(String id);

    User findById(String id);
}
