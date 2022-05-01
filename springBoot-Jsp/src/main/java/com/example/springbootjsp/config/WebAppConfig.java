package com.example.springbootjsp.config;

import com.example.springbootjsp.web.MyFilter;
import com.example.springbootjsp.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebAppConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean()
    {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean();
filterFilterRegistrationBean.setFilter(new MyFilter());
filterFilterRegistrationBean.addUrlPatterns("/user/*");
return filterFilterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
//    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/login");
//        servletRegistrationBean.setServlet(new MyServlet());
//        servletRegistrationBean.addUrlMappings("/login");

        return servletRegistrationBean;
    }
}
