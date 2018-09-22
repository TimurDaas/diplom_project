package diplom.startup;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by тимур50 on 04.09.2018.
 */
public class BLContextListener implements ServletContextListener {
    private static final Logger logger = Logger.getLogger(BLContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("BLContextListener [init] initializing BL config");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("BLContextListener [init] destroys BL config");
    }

}