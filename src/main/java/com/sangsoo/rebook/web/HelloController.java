package com.sangsoo.rebook.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1. RestController : Controller를 JSON을 반환하는 Controller로 만들어 준다.
 *  각 메소드마다 ResponseBody 선언을 했던 것을 한번에 사용할 수 있게 해주는 효과가 있음.
 *
 * 2. GetMapping : HTTP Method 중 GET 요청을 받는 API를 만들어 준다.
 *  GetMapping = @RequestMapping(method=RequestMethod.GET)
 * */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
