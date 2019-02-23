package ua.com.timur.common.as;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.timur.common.Consts;

/**
 * Created by тимур50 on 23.02.2019.
 */
public class ASUtilsFactory {
    private static final Logger logger = LoggerFactory.getLogger(ASUtilsFactory.class);

    private static volatile AS as;

    public static AS getAS() {
        if (as == null) {
            as = AS.valueOf(System.getProperty(Consts.PROP_NODE_AS));
        }
        return as;
    }

    public static boolean needLoadPropFile() {
        if(getAS() != AS.JBOSS6)
            return true;
        return false;
    }
}
