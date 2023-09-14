package com.hotel.myhotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.hotel.myhotel.mapper")
public class MyHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHotelApplication.class, args);
    }

}
