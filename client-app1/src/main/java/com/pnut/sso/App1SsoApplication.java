package com.pnut.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 过滤器配置介绍Doc：
 * http://doc.okbase.net/234390216/archive/105696.html
 * http://blog.csdn.net/u010475041/article/details/78094251
 */
@SpringBootApplication
public class App1SsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(App1SsoApplication.class, args);
    }

    /**
     * 设定首页
     */
    @Configuration
    public class DefaultView extends WebMvcConfigurerAdapter {

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            //设定首页为index
            registry.addViewController("/").setViewName("forward:/index");

            //设定匹配的优先级
            registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

            //添加视图控制类
            super.addViewControllers(registry);
        }
    }
}
