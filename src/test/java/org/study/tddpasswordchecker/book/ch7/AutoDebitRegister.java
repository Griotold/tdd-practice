package org.study.tddpasswordchecker.book.ch7;

import java.time.LocalDateTime;

/**
 * 자동이체 정보 등록 기능
 * */
public class AutoDebitRegister {
    private CardNumberValidator validator;
    private AutoDebitInfoRepository repository;

    public AutoDebitRegister(CardNumberValidator validator, AutoDebitInfoRepository repository) {
        this.validator = validator;
        this.repository = repository;
    }

    public RegisterResult register(AutoDebitReq req) {
        CardValidity validity = validator.validate(req.getCardNumber());

        if (validity != CardValidity.VALID) {
            return RegisterResult.error(validity);
        }
        AutoDebitInfo info = repository.findOne(req.getUserId());
        if (info != null) {
            info.changeCardNumber(req.getCardNumber());
        } else {
            AutoDebitInfo newInfo = new AutoDebitInfo(req.getUserId(), req.getCardNumber(), LocalDateTime.now());
            repository.save(newInfo);
        }
        return RegisterResult.success(validity);
    }
}
