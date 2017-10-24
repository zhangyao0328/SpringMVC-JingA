package com.yao.springmvc;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends AbstractController {


    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        System.out.println("Hello SpringMVChhhhhhhh");

        return new ModelAndView("index");
    }
}
