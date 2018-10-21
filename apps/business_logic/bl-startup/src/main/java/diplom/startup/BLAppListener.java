package diplom.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import ua.com.timur.config.UserMapper;
import ua.com.timur.entity.UserVO;

import java.util.List;

/**
 * Created by тимур50 on 04.09.2018.
 */

@Service
public class BLAppListener implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BLAppListener.class);

    @Autowired
    @Qualifier(value = "userMapper")
    UserMapper userMapper;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initCryptoInstance();
        List<UserVO> users = userMapper.getAll();
        LOGGER.info("InitCryptoInstance");
    }

    private static void initCryptoInstance()
    {

    }
}
