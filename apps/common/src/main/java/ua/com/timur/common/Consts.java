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
    public static boolean isLicenseReaded = false;
    public static final String APP_CONFIG_FILE_PATH = getSystemProperty("app.config.file.path", "E:\\app.config");
    public static final String TEST_PROP = getSystemProperty("test.prop","");
    public static final String BL_REMOTE_URL = getSystemProperty("bl.remote.url","");
    public static final int HTTPINVOKER_MAX_TOTAL_CONNECTIONS = getSystemProperty("bl.http.invoker.max.total.conn", 300);
    public static final int HTTPINVOKER_MAX_CONNECTIONS_PER_ROUTE = getSystemProperty("bl.http.invoker.max.conn.per.route", 300);

    public static final boolean SHOW_LOGIN_FIRST_STEP_PAGE = getProperty("show.login.first.step.page", false);
    public static final String APP_WEB_CLIENT_TITLE = getProperty("app.web.client.title", "\u0414\u0438\u043c\u043f\u043b\u043e\u043c\u043d\u043e\u0435 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u0435");
    public static String MOBILE_ID_URL = getProperty("mobile.id.auth.url","");
    public static String MOBILE_ID_CLIENT_ID = getProperty("mobile.id.client_id","");
    public static String MOBILE_ID_CLIENT_SECRET = getProperty("mobile.id.client_secret","");
    public static String APP_SIGN_ENCODING = getProperty("app.sign.encoding", "UTF-8");
    public static boolean APP_SELF_REGISTRATION_ENABLED = getProperty("app.self.registration.enabled", false);



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
        return value != null ? Boolean.valueOf(value) : defaultValue;
    }

    public static int getSystemProperty(String name, int defaultValue) {
        String value = System.getProperty(name);
        return value != null ? Integer.parseInt(value) : defaultValue;
    }

}
