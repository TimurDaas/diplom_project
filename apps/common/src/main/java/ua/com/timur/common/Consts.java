package ua.com.timur.common;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by тимур50 on 01.11.2018.
 */
public class Consts {


    public static final String APP_CONFIG_FILE_PATH = System.getProperty("app.config.file.path", "E:\\app.config");
    public static final String TEST_PROP = getProperty("test.prop","");
    public static final boolean SHOW_WELCOME_PAGE = getProperty("show.welcome.page", true);
    public static String MOBILE_ID_URL = getProperty("mobile.id.auth.url","");




    public static String getProperty(String name, String defaultValue) {
        return System.getProperty(name,defaultValue);
    }

    public static boolean getProperty(String name, boolean defaultValue) {
        String value = System.getProperty(name);
        return value.isEmpty() ? defaultValue : Boolean.valueOf(value);
    }

    public static int getProperty(String name, int defaultValue) {
        String value = System.getProperty(name);
        return value.isEmpty() ? defaultValue : Integer.parseInt(value);
    }

}
