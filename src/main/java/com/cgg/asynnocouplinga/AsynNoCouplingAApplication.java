package com.cgg.asynnocouplinga;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class AsynNoCouplingAApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsynNoCouplingAApplication.class, args);
    }

}
