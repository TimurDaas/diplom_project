package ua.com.timur.services;


import org.springframework.stereotype.Service;
import ua.com.timur.interfaces.FirstBean;
/**
 * Created by тимур50 on 08.10.2018.
 */
@Service
public class FirstBeanImpl implements FirstBean{
    private String name = "default name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
