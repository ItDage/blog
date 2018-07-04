package com.itcap.dao;

import java.util.List;

import com.itcap.entity.Article;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by cmhy on 2018/7/4.
 */
@Component
@Mapper
public interface ArticleMapper {

    public List<Article> getAll();
}
