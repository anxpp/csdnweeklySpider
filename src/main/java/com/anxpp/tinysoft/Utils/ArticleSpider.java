package com.anxpp.tinysoft.Utils;

import com.anxpp.tinysoft.Utils.analyzer.impl.CsdnWeeklyDocumentAnalyzer;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章抓取工具
 * Created by anxpp.com on 2017/3/11.
 */
public class ArticleSpider {

    private static final Logger log = LoggerFactory.getLogger(ArticleSpider.class);

    public static <T> List<T> forEntityList(String url, CsdnWeeklyDocumentAnalyzer docAnalyzer, Class<T> type) throws Exception {

        log.info("开始抓取文章："+url);

        List<T> results = new ArrayList<>();
        docAnalyzer.forListMap(Jsoup.connect(url).timeout(50000).get()).forEach(map->{
            try {
                results.add(TinyUtil.mapToBean(map, type));
            } catch (Exception ignored) {}
         });
        return results;
    }
}