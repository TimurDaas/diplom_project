package ua.com.timur.mappers;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ua.com.timur.entity.UserVO;

import java.util.List;

/**
 * Created by тимур50 on 10.10.2018.
 */

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<UserVO> getAll();

}
