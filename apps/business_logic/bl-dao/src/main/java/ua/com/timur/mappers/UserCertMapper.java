package ua.com.timur.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ua.com.timur.entities.UserCertVO;

/**
 * Created by тимур50 on 26.02.2019.
 */
@Mapper
public interface UserCertMapper {

    @Select("select uc.*, ct.certauthtype, ct.state as certtypestate from usercert uc, certtype ct where uc.id = " +
            "(select MAX(id) from usercert where userid = #{userId})" +
            "and ct.id = uc.certtypeid")
    UserCertVO getActiveBankCertByUserId(@Param("userId") int userId);

    @Select("select uc.*, ct.certauthtype, ct.state as certtypestate from usercert uc, certtype ct where uc.id = #{id} and ct.id = uc.certtypeid")
    UserCertVO getCertByCertId(@Param("id") int certId);
}
