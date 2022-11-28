package com.jm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(
                ApplicationConfig.class
        );
        Car car = ac.getBean(Car.class);
        car.run();

        String[] beans = ac.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
