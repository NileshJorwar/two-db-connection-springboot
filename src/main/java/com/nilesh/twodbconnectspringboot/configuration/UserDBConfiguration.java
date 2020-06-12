package com.nilesh.twodbconnectspringboot.configuration;

import com.nilesh.twodbconnectspringboot.entity.UserClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.nilesh.twodbconnectspringboot.user.repository"}, entityManagerFactoryRef = "userDSEmFactory", transactionManagerRef = "userDSTransactionManager")
public class UserDBConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties("spring.user.datasource1")
    public DataSourceProperties userDSProperties(){
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource userDS(@Qualifier("userDSProperties") DataSourceProperties userDSProperties){
        return userDSProperties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean userDSEmFactory(@Qualifier("userDS") DataSource userDS, EntityManagerFactoryBuilder builder){
        return builder.dataSource(userDS).packages(UserClass.class).build();
    }

    @Bean
    public PlatformTransactionManager userDSTransactionManager(EntityManagerFactory userDSEmFactory){
        return new JpaTransactionManager(userDSEmFactory);
    }
}
