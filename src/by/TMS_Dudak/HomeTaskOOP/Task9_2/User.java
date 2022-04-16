package by.TMS_Dudak.HomeTaskOOP.Task9_2;

public class User {
    Basket basket;
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "basket=" + basket +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
