package com.itcap.util;

import com.itcap.entity.BaseDoMain;

import org.springframework.stereotype.Component;

/**
 * Created by cmhy on 2018/7/5.
 */
@Component
public class ArticlePageUtil {


    /**
     * 分页工具
     * @Description 利用了多态,子类引用指向父类，父类的引用指向子类对象。这里不能new父类,否则调用者强转不成功
     * @param baseDoMain 父类的引用
     * @param direction 方向
     * @param limit 是否开启分页
     * @param page 页码
     * @param count 每页条数
     * @return
     */
    public static BaseDoMain pagingParam(BaseDoMain baseDoMain, String direction, boolean limit, int page, int count){
        baseDoMain.setDirection(direction);
            if(limit){
                baseDoMain.setLimit(true);
                page = (page - 1) * count;
                baseDoMain.setPage(page);
                baseDoMain.setCount(count);
            }
            return baseDoMain;
    }
}
