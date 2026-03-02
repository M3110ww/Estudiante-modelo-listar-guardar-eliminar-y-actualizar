package com.example.demo.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI (){

        return new OpenAPI()
                .info(new Info()
                        .title("API UNIVERSIDAD")
                        .version("1.8")
                        .description("API PARA UNIVERSIDAD")
                        .contact(new Contact()));





    }




}
