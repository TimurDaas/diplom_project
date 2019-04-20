package diplom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import ua.com.timur.interfaces.FirstBean;
import ua.com.timur.services.FirstBeanImpl;

/**
 * Created by тимур50 on 02.03.2019.
 */

@Configuration
public class BLRemoteExportConfig {

    @Bean("/firstBeanHttpService")
    @Autowired
    public HttpInvokerServiceExporter firstBeanHttpService(FirstBeanImpl firstBean) {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(FirstBean.class);
        exporter.setService(firstBean);
        exporter.setRegisterTraceInterceptor(true);
        return exporter;
    }

}
