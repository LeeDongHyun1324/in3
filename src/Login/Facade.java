package Login;

public class Facade {
    private LoginHandler loginHandler;
    private PasswordResetHandler passwordResetHandler;
    private Register register;
    private AccountDeletion accountDeletion;
    private Finder finder;

    public Facade() {
        this.loginHandler = new LoginHandler();
        this.passwordResetHandler = new PasswordResetHandler();
        this.register = new Register();
        this.accountDeletion = new AccountDeletion();
        this.finder = new Finder();
    }

    public void login(String username, String password) {
        loginHandler.login(username, password);
    }

    public void resetPassword(String email) {
        passwordResetHandler.resetPassword(email);
    }

    public void registerUser(String username, String password, String email) {
        register.registerUser(username, password, email);
    }

    public void deleteAccount(String username) {
        accountDeletion.deleteAccount(username);
    }

    public void findUser(String username) {
        finder.findUser(username);
    }
}