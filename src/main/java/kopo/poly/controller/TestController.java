package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TestController {

    @GetMapping(value = "index")
    public String index(HttpServletRequest request) throws Exception{
        log.info(this.getClass().getName() + "index 페이지 시작");

        String name = request.getParameter("name");
        log.info(name);



                return "index";
    }
}


