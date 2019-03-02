package diplom.web.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import ua.com.timur.interfaces.FirstBean;

/**
 * Created by timur.daas on 06.12.2018.
 */
@Component
public class PLAppContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    public PLAppContextInit(){
        super();
    }

    @Autowired
    @Qualifier(value = "firstBeanHttpInvoker")
    private FirstBean firstBean;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        new PLStaticContext().setPLApplicationContext(configurableApplicationContext);
    }
}
