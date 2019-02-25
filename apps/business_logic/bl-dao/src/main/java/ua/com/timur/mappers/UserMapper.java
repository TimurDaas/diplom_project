package ua.com.timur.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import ua.com.timur.entities.UserVO;

import java.util.List;

/**
 * Created by тимур50 on 13.12.2018.
 */
@Mapper
//@Service(value = "userMapper")
public interface UserMapper {

    @Select("select * from users")
    List<UserVO> getAll();

    @Select("select * from users where login = #{login}")
    List<UserVO> getUserByLogin(@Param("login") String login);

    @Select("select id from users where login = #{login}")
    int getUserId(@Param("login") String login);
}
