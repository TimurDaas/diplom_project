package diplom.web.startup;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by timur.daas on 06.12.2018.
 */
@Component
public class PLAppContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    public PLAppContextInit(){
        super();
    }


    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        new PLStaticContext().setPLApplicationContext(configurableApplicationContext);
    }
}
