package com.anxpp.tinysoft.Utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * 文章抓取单元测试
 * Created by anxpp.com on 2017/3/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleSpiderTest{

    private static Logger log = LoggerFactory.getLogger(ArticleSpiderTest.class);

    //html地址
    private String url;


    @Before
    public void setUp() {
        this.url = "http://lib.csdn.net/weekly/51";
    }

    @Test
    public void getHtml() throws Exception {
        //文档对象，用来接收html页面
        Document document = null;
        try {
            //获取指定网址的页面内容
            document = Jsoup.connect(url).timeout(50000).get();
        } catch (IOException e) {
            e.printStackTrace();
            log.info("异常");
        }
        assert document != null;
        Element body = document.body();
        Elements elements = body.getElementsByClass("pclist").get(0).children();
        elements.forEach(ele-> log.info(ele.getElementsByTag("span").get(0).getElementsByTag("a").get(0).getElementsByTag("img").get(0).attr("src")));

        log.info(elements.text());

        Assert.assertNotNull(elements);
    }

}