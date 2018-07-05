package com.itcap.controller;

import java.util.List;

import com.itcap.entity.Article;
import com.itcap.entity.Result;
import com.itcap.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmhy on 2018/7/4.
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/get")
    public Result getAll(int page){
        Result result = new Result();
        result.setMsg("success");
        result.setCode(200);
        result.setData(articleService.getAll(page));
        //总页数
        result.setData2(articleService.count() / Article.COUNT + 1);
        return result;
    }
}
