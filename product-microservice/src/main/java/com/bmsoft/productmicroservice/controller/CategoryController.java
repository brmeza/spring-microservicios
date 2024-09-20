package com.bmsoft.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
@RefreshScope
public class CategoryController {

    /*tendremos un endpoint que nos ayude a testear que
    cuando realicemos un comit desde nuestra configuracion centralizada
    se esta reflejando tambien en nuestro product microservice sin al necesitad de
    reiniciar
    */

    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestProp(){
        return testProp;
    }


}
