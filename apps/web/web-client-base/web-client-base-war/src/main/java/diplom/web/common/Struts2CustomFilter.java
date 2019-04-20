package diplom.web.common;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by тимур50 on 03.03.2019.
 */
public class Struts2CustomFilter extends StrutsPrepareAndExecuteFilter {
    private static final String ACTION_EXTENSION = ".action";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req instanceof HttpServletRequest && ((HttpServletRequest) req).getRequestURI().endsWith(ACTION_EXTENSION)) {
            super.doFilter(req, res, chain);
        } else {
            chain.doFilter(req, res);
        }
    }
}
