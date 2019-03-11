package diplom.web.struts.registration;

import diplom.web.struts.WebClientBaseAction;

/**
 * Created by тимур50 on 09.03.2019.
 */
public class SelfRegistrationAction extends WebClientBaseAction {

    private String name;
    private String surname;
    private String middlename;
    private int usertype;

    @Override
    protected String executeInherited() throws Exception {
        if(usertype > 4)
            return ERROR;
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }
}
