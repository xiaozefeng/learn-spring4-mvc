package com.gz.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xiaozefeng
 * @ControllerAdvice 声明一个控制器建言
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    /**
     * 全局异常处理， 拦截抛出异常为Exception 或者其子类的异常
     *
     * @param exception
     * @param request
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errmsg", exception.getMessage());
        return modelAndView;
    }


    /**
     * 将健值对添加到全局， 所有注解的@RequestMapping 都可以获取次健值对
     *
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }
}
