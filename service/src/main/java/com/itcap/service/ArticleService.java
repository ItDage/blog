package com.itcap.service;

import java.util.List;


import com.github.pagehelper.PageHelper;
import com.itcap.dao.ArticleMapper;
import com.itcap.entity.Article;
import com.itcap.entityUtil.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cmhy on 2018/7/4.
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> getAll() {
        PageHelper.startPage(1, 5);
        List<Article> list = articleMapper.getAll();
        PageInfo<Article> pageInfo2 = new PageInfo<>(list);
        System.out.println(pageInfo2.toString());

        return articleMapper.getAll();
    }
}
