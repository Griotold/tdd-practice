package org.study.tddpasswordchecker.book.ch7;

public interface AutoDebitInfoRepository {

    public AutoDebitInfo findOne(String userId);

    public void save(AutoDebitInfo newInfo);
}
