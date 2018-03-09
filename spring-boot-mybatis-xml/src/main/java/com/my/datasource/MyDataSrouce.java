package com.my.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by dev on 2018/2/9.
 */
@Configuration
public class MyDataSrouce {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    public javax.sql.DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 数据库驱动
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        // 相应驱动的jdbcUrl
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        // 数据库的用户名
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        // 数据库的密码
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        // 初始化时建立物理连接的个数
        dataSource.setInitialSize(2);
        // 每个分区最大的连接数
        dataSource.setMaxActive(20);
        // 最小连接池数量
        dataSource.setMinIdle(0);
        // 获取连接时最大等待时间，单位毫秒。
        dataSource.setMaxWait(60000);
        // 用来检测连接是否有效的sql
        dataSource.setValidationQuery("SELECT 1");
        // 申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestOnBorrow(true);
        // 建议配置为true，不影响性能，并且保证安全性。
        dataSource.setTestWhileIdle(true);
        return dataSource;
    }

}
