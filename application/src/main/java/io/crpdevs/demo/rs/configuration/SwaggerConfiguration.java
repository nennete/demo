package io.crpdevs.demo.rs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(
            null,
            "none",
            "alpha",
            "schema",
            UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
            false,
            true,
            60000L);
    }

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("io.crpdevs.demo.rs.controller"))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("A simple demo service")
            .description("A simple demo REST service made with Spring Boot in Java")
            .contact(new Contact("Antonio Berben", "https://github.com/nennete/demo-resource-server", "test@gmail.com"))
            .version("1.0")
            .build();
    }
}
