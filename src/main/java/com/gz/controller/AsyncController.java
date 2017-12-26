package com.gz.controller;

import com.gz.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author xiaozefeng
 */
@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @RequestMapping("defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() {
        return pushService.getDeferredResult();
    }
}
