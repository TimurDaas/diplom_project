package ua.com.timur.common;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by тимур50 on 01.11.2018.
 */
@Service
public class PropertyLoader extends Properties {

    private static Logger logger = Logger.getLogger(PropertyLoader.class);

    @PostConstruct
    public void load() throws IOException {
        FileInputStream in = new FileInputStream(Consts.APP_CONFIG_FILE_PATH);
        load(in);
    }
}
