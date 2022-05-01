package com;

import com.bjpowernode.Student;
import com.bjpowernode.Tagger;
import com.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void text1(){
        String config="beans.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ctx.getBean("myStudent");
        System.out.println(myStudent);
    }
    @Test
    public void text2(){
//        String config="beans.xml";
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student myStudent = (Student) ctx.getBean("createStudent");
        System.out.println(myStudent);
    }
    @Test
    public void text3(){
//        String config="beans.xml";
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Tagger myStudent = (Tagger) ctx.getBean("Tiger");
        System.out.println(myStudent);
    }
}
