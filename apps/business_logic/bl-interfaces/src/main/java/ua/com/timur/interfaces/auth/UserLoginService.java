package ua.com.timur.interfaces.auth;

/**
 * Created by тимур50 on 13.12.2018.
 */
public interface UserLoginService {

    boolean checkUser(String login, String pwd);

    boolean checkUser(String login, String pwd, String certSerial, String sign, String dataToSign);

    boolean checkUserbyCert(String certSerial, String sign, String dataToSign);
}
