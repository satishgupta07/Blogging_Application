package com.satishgupta.blog_app.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Blogging App APIs")
                        .description("APIs for Blogging App developed in Spring Boot")
                        .version("1.0.0")
                        .contact(new Contact().name("Satish Kumar Gupta"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Blogging App Wiki Documentation")
                        .url("https://github.com/satishgupta07/Blogging_Application"));

    }
}
