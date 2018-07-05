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

    public List<Article> getAll(int page) {
        Article article = new Article();
        article.setSort(true);
        article.setDirection("desc");
        article.setLimit(true);
        article.setCount(Article.COUNT);
        page = (page - 1) * Article.COUNT;
        article.setPage(page);
        article.setCount(10);
        return articleMapper.getAll(article);
    }

    public int count(){
        return articleMapper.count();
    }
}
