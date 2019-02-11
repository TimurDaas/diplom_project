package ua.com.timur.common;

/**
 * Created by тимур50 on 01.11.2018.
 */
public class Consts {


    public static final String APP_CONFIG_FILE_PATH = System.getProperty("app.config.file.path", "E:\\app.config");
    public static final String TEST_PROP = getProperty("test.prop","");
    public static final boolean SHOW_WELCOME_PAGE = getProperty("show.welcome.page", true);
    public static String MOBILE_ID_URL = getProperty("mobile.id.auth.url","");
    public static String APP_DB_URL = getProperty("app.db.url","");
    public static String APP_DB_USER = getProperty("app.db.user","");
    public static String APP_DB_PASSWORD = getProperty("app.db.password","");
    public static String APP_SIGN_ENCODING = getProperty("app.sign.encoding", "UTF-8");




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
