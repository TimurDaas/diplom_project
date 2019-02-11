package ua.com.timur.entities;

/**
 * Created by тимур50 on 13.12.2018.
 */
public class UserVO {
    private int id;
    private String login;
    private String password;
    private String surname;
    private String givenname;
    private String middlename;
    private String indentifycode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getIndentifycode() {
        return indentifycode;
    }

    public void setIndentifycode(String indentifycode) {
        this.indentifycode = indentifycode;
    }
}
