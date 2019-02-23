package ua.com.timur.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.timur.common.as.ASUtilsFactory;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by тимур50 on 01.11.2018.
 */
public class Consts {
    private static final Logger LOGGER = LoggerFactory.getLogger(Consts.class);

    static {
        if(ASUtilsFactory.needLoadPropFile()) {
            try {
                System.getProperties().load(new FileInputStream(System.getProperty("diplom.config")));
                LOGGER.info("Loaded properties: ", System.getProperties());
            } catch (Exception e) {
                LOGGER.error("Error while loading config file into System properties", e);
            }
        }

    }


    public static final String PROP_NODE_AS = "node.as";

    public static final String APP_CONFIG_FILE_PATH = getSystemProperty("app.config.file.path", "E:\\app.config");
    public static final String TEST_PROP = getSystemProperty("test.prop","");
    public static final String APP_DB_URL = getSystemProperty("app.db.url","");
    public static final String APP_DB_USER = getSystemProperty("app.db.user","");
    public static final String APP_DB_PASSWORD = getSystemProperty("app.db.password","");

    public static final boolean SHOW_WELCOME_PAGE = getProperty("show.welcome.page", true);
    public static String MOBILE_ID_URL = getProperty("mobile.id.auth.url","");
    public static String MOBILE_ID_CLIENT_ID = getProperty("mobile.id.client_id","");
    public static String MOBILE_ID_CLIENT_SECRET = getProperty("mobile.id.client_secret","");
    public static String APP_SIGN_ENCODING = getProperty("app.sign.encoding", "UTF-8");
    public static boolean isLicenseReaded = false;


    public static String getProperty(String name, String defaultValue) {
        return PropertyLoader.getPropertyLoader().getProperty(name, defaultValue);
    }

    public static String getProperty(String name) {
        return PropertyLoader.getPropertyLoader().getProperty(name);
    }

    public static boolean getProperty(String name, boolean defaultValue) {
        String value = getProperty(name);
        return value != null ? Boolean.parseBoolean(value) : defaultValue;
    }

    public static int getProperty(String name, int defaultValue) {
        String value = getProperty(name);
        return value != null ? Integer.parseInt(value) : defaultValue;
    }

    public static String getSystemProperty(String name, String defaultValue) {
        return System.getProperty(name,defaultValue);
    }

    public static boolean getSystemProperty(String name, boolean defaultValue) {
        String value = System.getProperty(name);
        return value != null ? defaultValue : Boolean.valueOf(value);
    }

    public static int getSystemProperty(String name, int defaultValue) {
        String value = System.getProperty(name);
        return value != null ? defaultValue : Integer.parseInt(value);
    }

}
