package com.anxpp.tinysoft.core.service.impl;

import com.anxpp.tinysoft.Utils.ArticleSpider;
import com.anxpp.tinysoft.Utils.analyzer.impl.CsdnWeeklyDocumentAnalyzer;
import com.anxpp.tinysoft.core.entity.Article;
import com.anxpp.tinysoft.core.service.ArticleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文章service实现
 * Created by anxpp.com on 2017/3/11.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Value("${csdn.weekly.preurl}")
    private String preUrl;
    @Resource
    private CsdnWeeklyDocumentAnalyzer csdnWeeklyDocumentAnalyzer;

    /**
     * 根据期号获取文章列表
     *
     * @param stage 期号
     * @return 文章列表
     */
    @Override
    @Cacheable(value = "reportcache", keyGenerator = "csdnKeyGenerator")
    public List<Article> forWeekly(Integer stage) throws Exception {
        List<Article> articleList = ArticleSpider.forEntityList(preUrl + stage, csdnWeeklyDocumentAnalyzer, Article.class);
        articleList.forEach(article -> article.setStage(stage));
        return articleList;
    }
}