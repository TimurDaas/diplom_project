package diplom.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import ua.com.timur.common.Consts;
import ua.com.timur.interfaces.FirstBean;

/**
 * Created by тимур50 on 04.09.2018.
 */

@Service
public class BLAppListener implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BLAppListener.class);


    @Autowired
    FirstBean firstBean;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initCryptoInstance();
        LOGGER.info("InitCryptoInstance");
    }

    private static void initCryptoInstance()
    {
        System.out.println(Consts.MOBILE_ID_URL);
    }
}
