package diplom.web.startup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by тимур50 on 13.12.2018.
 */
public class PLStaticContext implements ApplicationContextAware{

    private static ApplicationContext applicationContext;

    public void setPLApplicationContext(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
