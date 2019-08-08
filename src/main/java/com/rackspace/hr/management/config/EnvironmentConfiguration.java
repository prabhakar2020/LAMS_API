package com.rackspace.hr.management.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class EnvironmentConfiguration {

    @Value("${mysql-uri}")
    private String mysqlUri;

    /**
     * @return the mysqlUri
     */
    public String getMysqlUri() {
        return mysqlUri;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EnvironmentConfiguration [mysqlUri=" + mysqlUri + "]";
    }

}
