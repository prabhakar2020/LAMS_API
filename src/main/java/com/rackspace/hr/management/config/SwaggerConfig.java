/*******************************************************************************
 * IBM Confidential
 * OCO Source Materials
 * 5725-S87
 * © Copyright IBM Corp. 2019
 * The source code for this program is not published or otherwise
 * divested of its trade secrets, irrespective of what has been
 * deposited with the U.S. Copyright Office.
 *******************************************************************************/
package com.rackspace.hr.management.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.rackspace.hr.management.utils.SwaggerConstants;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerConfig.class);

    private RequestMappingHandlerMapping mappingHandlerMapping;

    public SwaggerConfig(RequestMappingHandlerMapping mappingHandlerMapping) {
        this.mappingHandlerMapping = mappingHandlerMapping;
    }

    @Bean
    public Docket productApi() {

        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.rackspace.hr.management.controller"))
                .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(SwaggerConstants.TITLE).description(SwaggerConstants.DESCRIPTION)
                .version(SwaggerConstants.SWAGGER_VERSION).build();
    }
}