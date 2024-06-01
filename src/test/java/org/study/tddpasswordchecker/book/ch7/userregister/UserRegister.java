package org.study.tddpasswordchecker.book.ch7.userregister;

public class UserRegister {
    private WeakPasswordChecker weakPasswordChecker;
    private UserRepository userRepository;

    public UserRegister(WeakPasswordChecker weakPasswordChecker, UserRepository userRepository) {
        this.weakPasswordChecker = weakPasswordChecker;
        this.userRepository = userRepository;
    }

    public void register(String id, String pw, String email) {
        if (weakPasswordChecker.checkPassword(pw)) throw new WeakPasswordException();
        if (userRepository.isExist(id)) throw new DupIdException();
        userRepository.save(new User(id, pw, email));
    }
}
