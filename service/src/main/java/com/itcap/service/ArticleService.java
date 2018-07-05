package com.itcap.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import com.github.pagehelper.PageHelper;
import com.itcap.dao.ArticleMapper;
import com.itcap.entity.Article;
import com.itcap.entityUtil.PageInfo;
import com.itcap.util.ArticlePageUtil;

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
        //封装查询参数
        Article article = (Article) ArticlePageUtil.pagingParam(new Article(),"desc", true, page, Article.COUNT);
        //查询
        List<Article> list = articleMapper.getAll(article);
        //内容传输200个字符,减少流量传输
        list.stream().forEach(article2 -> {
            if(article2.getContent().length() >= 200){
                article2.setContent(article2.getContent().substring(0, 200));
            }
        });
        return list;
    }

    public int count(){
        return articleMapper.count();
    }
}
