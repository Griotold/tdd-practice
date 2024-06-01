package org.study.tddpasswordchecker.book.ch7.userregister;

public class UserRegister {
    private WeakPasswordChecker weakPasswordChecker;
    private UserRepository userRepository;
    private EmailNotifier EmailNotifier;

    public UserRegister(WeakPasswordChecker weakPasswordChecker, UserRepository userRepository, EmailNotifier emailNotifier) {
        this.weakPasswordChecker = weakPasswordChecker;
        this.userRepository = userRepository;
        this.EmailNotifier = emailNotifier;
    }

    public void register(String id, String pw, String email) {
        if (weakPasswordChecker.checkPassword(pw)) throw new WeakPasswordException();
        if (userRepository.isExist(id)) throw new DupIdException();
        userRepository.save(new User(id, pw, email));

        EmailNotifier.sendRegisterEmail(email);
    }
}
