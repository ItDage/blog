package com.itcap.controller;

import com.itcap.entity.Result;
import com.itcap.service.IndexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmhy on 2018/7/3.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;


    @RequestMapping("/index")
    public Result test(){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        System.out.println(indexService.test());
        return result;
    }
}
