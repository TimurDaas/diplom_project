package ua.com.timur.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ua.com.timur.common.entities.UserCertVO;

/**
 * Created by тимур50 on 26.02.2019.
 */
@Mapper
public interface UserCertMapper {

    @Select("select * from vusercert uc where uc.id = " +
            "(select MAX(id) from usercert where userid = #{userId})")
    UserCertVO getActiveBankCertByUserId(@Param("userId") int userId);

    @Select("select * from vusercert where uc.id = #{id} and ct.id = uc.certtypeid")
    UserCertVO getCertByCertId(@Param("id") int certId);
}
