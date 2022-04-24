package by.TMS_Dudak.Lesson11.HomeTask.Task1Cloud;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Info {

    private StringBuilder login = new StringBuilder(20);
    private StringBuilder password = new StringBuilder(20);
    private StringBuilder repPassword = new StringBuilder(20);


    public Info(){

    }

    public boolean registration(String login, String password, String repPassword){
        try {
            Pattern pattern = Pattern.compile(".+\\w");
            Matcher matcher = pattern.matcher(login);
            if (!matcher.matches() || login.length()>20) {
                throw new WrongLoginException();
            }
            Pattern patternPas = Pattern.compile(".+\\w");
            Matcher matcherPas = patternPas.matcher(password);
            if (!matcherPas.matches() || password.length()>20) {
                throw new WrongPasswordException();
            }
            Pattern patternPasRep = Pattern.compile(".+\\w");
            Matcher matcherPasRep = patternPasRep.matcher(repPassword);
            if (!matcherPasRep.matches()|| repPassword.length()>20) {
                throw new WrongPasswordException();
            }
            if(!password.equals(repPassword)){
                throw new WrongPasswordException();
            }
        }catch (WrongLoginException e) {
            System.err.println("Вы ввели неправильный формат Логина!");
            return false;
        }catch (WrongPasswordException e) {
            System.err.println("Вы ввели неправильный формат Пароля!");
            return false;
        }
        return true;
    }

    public StringBuilder getLogin() {
        return login;
    }

    public void setLogin(StringBuilder login) {
        this.login = login;
    }

    public StringBuilder getPassword() {
        return password;
    }

    public void setPassword(StringBuilder password) {
        this.password = password;
    }

    public StringBuilder getRepPassword() {
        return repPassword;
    }

    public void setRepPassword(StringBuilder repPassword) {
        this.repPassword = repPassword;
    }
}
