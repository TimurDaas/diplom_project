package diplom.startup;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by тимур50 on 04.09.2018.
 */

@Component
public class BLAppContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BLAppContextInit.class);

    public BLAppContextInit() {
        super();
        System.out.println("BL Application context listener is created!");
    }

    private static void shutdownServer(int code) {
        try {
            LOGGER.error("SERVER STOPPED WITH CODE: " + code);
            System.exit(code);

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

    }
}
