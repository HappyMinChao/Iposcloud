package com.beijing.ds;/**
 * Created by zhou.zhao on 17-4-11.
 */

import com.lefu.dsmclient.v2.c3p0.LefuPooledDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author zhaozhou
 * @create 2017-04-11 下午4:18
 **/
@Configuration
public class LefuDsConfiguration {

    @Bean(name = "dataSource")
    @Qualifier(value = "dataSource")
    @Primary
    @ConfigurationProperties(locations = "classpath:datasouce.properties",prefix = "lefuds")
    @ConditionalOnProperty(
            prefix = "lefuds",
            name = {"enabled"},
            matchIfMissing = true
    )
    public DataSource dataSource()
    {
        return DataSourceBuilder.create().type(LefuPooledDataSource.class).build();
    }
}