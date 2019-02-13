package ua.com.timur.common;

import org.apache.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by тимур50 on 01.11.2018.
 */
public class PropertyLoader extends Properties {

    private static PropertyLoader propertyLoader = null;
    private static Logger logger = Logger.getLogger(PropertyLoader.class);

    private PropertyLoader() {
        load();
    }

    public static PropertyLoader getPropertyLoader() {
        if (propertyLoader == null)
            propertyLoader = new PropertyLoader();
        return propertyLoader;
    }

    private void load() {
        try {
            FileInputStream in = new FileInputStream(Consts.APP_CONFIG_FILE_PATH);
            load(in);
        } catch (Exception e) {
            logger.fatal("Error while loading config file");
        }
    }
}
