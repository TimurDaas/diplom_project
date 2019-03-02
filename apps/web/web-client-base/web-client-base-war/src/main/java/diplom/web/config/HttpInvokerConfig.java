package diplom.web.config;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.apache.http.client.HttpClient;
import ua.com.timur.common.Consts;
import ua.com.timur.interfaces.FirstBean;

/**
 * Created by тимур50 on 02.03.2019.
 */

@Configuration
public class HttpInvokerConfig {

    private HttpInvokerProxyFactoryBean getProxy(String contextName, Class interfaceClass) {
        HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
        invoker.setServiceUrl(Consts.BL_REMOTE_URL+"/"+contextName);
        invoker.setServiceInterface(interfaceClass);
        //invoker.setHttpInvokerRequestExecutor(new HttpComponentsHttpInvokerRequestExecutor(createHttpClient()));
        return invoker;
    }

    private static HttpClient createHttpClient() {
        Registry<ConnectionSocketFactory> schemeRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", SSLConnectionSocketFactory.getSocketFactory())
                .build();

        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(schemeRegistry);
        connectionManager.setMaxTotal(Consts.HTTPINVOKER_MAX_TOTAL_CONNECTIONS);
        connectionManager.setDefaultMaxPerRoute(Consts.HTTPINVOKER_MAX_CONNECTIONS_PER_ROUTE);

        return HttpClientBuilder.create().setConnectionManager(connectionManager).build();
    }

    @Bean
    public HttpInvokerProxyFactoryBean firstBeanHttpInvoker() {
        return getProxy("firstBeanHttpService", FirstBean.class);
    }
}
