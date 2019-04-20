package diplom.web.struts.registration;

import diplom.web.struts.WebClientBaseAction;
import ua.com.timur.common.Consts;

/**
 * Created by тимур50 on 04.03.2019.
 */
public class SelfRegistrationShowAction extends WebClientBaseAction {
    @Override
    protected String executeInherited() throws Exception {
        if(Consts.APP_SELF_REGISTRATION_ENABLED)
            return SUCCESS;
        return LOGIN;
    }
}
