package ua.com.timur.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.timur.common.Consts;

import javax.sql.DataSource;

/**
 * Created by тимур50 on 10.10.2018.
 */

@Configuration
@MapperScan("ua.com.timur.mappers")
public class ConfigMyBatis {

    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(Consts.APP_DB_URL);
        dataSource.setUser(Consts.APP_DB_USER);
        dataSource.setPassword(Consts.APP_DB_PASSWORD);
        return dataSource;
    }

    @Bean
    @Autowired
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory.getObject();
    }
}
