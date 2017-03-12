# csdnweeklySpider
spring boot + jsoup + redis 抓取CSDN每周干货知识

1、内容已抽象，如果要抓取其他页面，可以自己实现DocumentAnalyzer即可。
2、对外的接口为RESTful的。
3、数据库已配置好，也可以将数据持久化到数据库

！注意：使用时请自行更改application.properties中的redis配置
