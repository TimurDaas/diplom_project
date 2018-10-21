package ua.com.timur.config;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ua.com.timur.entity.UserVO;

import java.util.List;

/**
 * Created by тимур50 on 10.10.2018.
 */

@Mapper
@Repository
public interface UserMapper {

    @Select("select * from users")
    List<UserVO> getAll();

}
