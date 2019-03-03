package diplom.web.struts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by тимур50 on 03.03.2019.
 */
public abstract class WebClientBaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware, ApplicationAware {
    private final static Logger LOGGER = LoggerFactory.getLogger(WebClientBaseAction.class);

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected ServletContext context;
    protected Map<String, Object> application;

    protected Map<String, Object> session;
    protected List<Integer> userRights;

    protected abstract String executeInherited() throws Exception;

    protected WebClientBaseAction() {
        HttpServletRequest servletRequest = ServletActionContext.getRequest();
        LOGGER.debug("\nRequest URI: " + servletRequest.getRequestURI() +
                "\nRequest Parameters: " + uncheckedObjectToJson(servletRequest.getParameterMap()));
        session = ActionContext.getContext().getSession();
        application = ActionContext.getContext().getApplication();
    }

    @Override
    public String execute() throws Exception{
        try {
            return executeInherited();
        } catch (Exception e) {
            LOGGER.error("Error while executing action: " + e.getClass().getSimpleName(), e);
            throw e;
        } finally {
            //do nothing
        }
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request = httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        response = httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        context = servletContext;
    }

    public static String uncheckedObjectToJson(Object o) {
        try {
            return new ObjectMapper().writeValueAsString(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
