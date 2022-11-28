package com.jm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        ApplicationContext ac =
                new FileSystemXmlApplicationContext("C:\\Users\\A\\Desktop\\study\\spring-example-code\\spring-example-code\\spring_with_gradle_n_xml\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
        System.out.println("초기화 완료!");

        String[]beans = ac.getBeanDefinitionNames();
        for (String bean : beans){
            System.out.println("bean : " + bean);
        }
//
//        UserBean userBean = ac.getBean("userBean",UserBean.class);
//        userBean.setName("KIM");
//
//        System.out.println(userBean.getName());
//
//        UserBean userBean2 = ac.getBean("userBean",UserBean.class);
//
//        if(userBean == userBean2){
//            System.out.println("같은 인스턴스");
//        }

        Car car = ac.getBean("c",Car.class);
        car.run();

        Engine engine = ac.getBean("e",Engine.class);
        Engine carEngine = car.getEngine();
        if(engine == carEngine){
            System.out.println("Engine 빈 일치!");
        }
    }
}
