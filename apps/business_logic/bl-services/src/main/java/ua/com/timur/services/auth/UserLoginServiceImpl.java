package ua.com.timur.services.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.com.timur.interfaces.auth.UserLoginService;
import ua.com.timur.mappers.UserMapper;

/**
 * Created by тимур50 on 13.12.2018.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    @Qualifier(value = "userMapper")
    private UserMapper userMapper;


    @Override
    public boolean checkUser(String login, String pwd) {
        return true;
    }

    @Override
    public boolean checkUser(String login, String pwd, String certSerial, String sign, String dataToSign) {
        return false;
    }

    @Override
    public boolean checkUserbyCert(String certSerial, String sign, String dataToSign) {
        return false;
    }
}
