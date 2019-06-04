package com.powerbridge.saas;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value = {"com.powerbridge.saas.dao"})
public class SpringbootMybatisPlusCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusCrudApplication.class, args);
    }

    /**
     * 	分页插件
     * @param 
     * @return
     * wenhaosun@powerbridge.com
     * 2019年6月4日 上午9:57:02
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
