package com.anxpp.tinysoft.controller;

import com.anxpp.tinysoft.core.entity.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章接口单元测试
 * Created by anxpp.com on 2017/3/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleControllerTest {

    private int stage;

    @Resource
    private ArticleController articleController;

    @Before
    public void setUp() throws Exception {
        this.stage = 1;
    }

    @Test
    public void getArticleByStage() throws Exception {
        List<Article> articleList = articleController.getArticleByStage(stage);
        articleController.getArticleByStage(stage);
        articleController.getArticleByStage(stage);
        Assert.assertNotNull(articleList);
    }

}