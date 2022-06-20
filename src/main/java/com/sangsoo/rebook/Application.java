package com.sangsoo.rebook;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동 설정
// SpringBootApplication 파일이 있는 위치부터 설정을 읽어간다. ==> 프로젝트 최상단에 위치해야한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
