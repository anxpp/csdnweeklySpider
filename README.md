# csdnweeklySpider

spring boot + jsoup + redis 抓取CSDN每周干货知识

1、内容已抽象，如果要抓取其他页面，可以自己实现DocumentAnalyzer即可。

2、对外的接口为RESTful的。

3、数据库已配置好，也可以将数据持久化到数据库

示例界面：
![](http://qiniu.anxpp.com//anxpp/com/tinysoft/csdn/weekly/2AO_0~Z%29R%7BP%7B%5DL4B%7B@P%28V%29F.png) 

可以访问 [http://anxpp.com:8765/article/get/stage/1][1] 测试：

    [
        {
            "id": null,
            "inertAt": 1489284256537,
            "name": "Tachyon更名为 Alluxio，并发布1.0版本",
            "url": "http://lib.csdn.net/article/spark/5851",
            "stage": 1,
            "views": 102,
            "collections": 102,
            "type": "http://lib.csdn.net/base/10",
            "img": "http://img.knowledge.csdn.net/upload/base/1453368118762_762.jpg",
            "updateAt": 1489284256537
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "Spark SQL Catalyst源码分析之SqlParser",
            "url": "http://lib.csdn.net/article/spark/5852",
            "stage": 1,
            "views": 65,
            "collections": 65,
            "type": "http://lib.csdn.net/base/10",
            "img": "http://img.knowledge.csdn.net/upload/base/1453368118762_762.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "Python之美[从菜鸟到高手]--生成器之全景分析",
            "url": "http://lib.csdn.net/article/python/5961",
            "stage": 1,
            "views": 72,
            "collections": 72,
            "type": "http://lib.csdn.net/base/11",
            "img": "http://img.knowledge.csdn.net/upload/base/1452500783406_406.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "Android 线程4件套 MessageQueue Message Looper Handler之Looper",
            "url": "http://lib.csdn.net/article/android/6035",
            "stage": 1,
            "views": 122,
            "collections": 122,
            "type": "http://lib.csdn.net/base/15",
            "img": "http://img.knowledge.csdn.net/upload/base/1455589744328_328.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "【Android界面实现】使用Canvas对象实现“刮刮乐”效果",
            "url": "http://lib.csdn.net/article/android/5995",
            "stage": 1,
            "views": 150,
            "collections": 150,
            "type": "http://lib.csdn.net/base/15",
            "img": "http://img.knowledge.csdn.net/upload/base/1455589744328_328.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "android线程 Handler Message Queue AsyncTask线程模型 线程交互 + 修改Button样式 示例 最终easy整合版",
            "url": "http://lib.csdn.net/article/android/5996",
            "stage": 1,
            "views": 54,
            "collections": 54,
            "type": "http://lib.csdn.net/base/15",
            "img": "http://img.knowledge.csdn.net/upload/base/1455589744328_328.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "地图的开发研究--基于openlayers+geoserver+tomcat的离线地图-JAVA项目跨域问题的解决",
            "url": "http://lib.csdn.net/article/java/5877",
            "stage": 1,
            "views": 167,
            "collections": 167,
            "type": "http://lib.csdn.net/base/13",
            "img": "http://img.knowledge.csdn.net/upload/base/1453701371636_636.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "数据库MySQL基础——增删查改",
            "url": "http://lib.csdn.net/article/mysql/5875",
            "stage": 1,
            "views": 186,
            "collections": 186,
            "type": "http://lib.csdn.net/base/14",
            "img": "http://img.knowledge.csdn.net/upload/base/1454051093684_684.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "使用 IDEA + Maven + Git 快速开发 Java Web 应用",
            "url": "http://lib.csdn.net/article/java/5843",
            "stage": 1,
            "views": 105,
            "collections": 105,
            "type": "http://lib.csdn.net/base/13",
            "img": "http://img.knowledge.csdn.net/upload/base/1453701371636_636.jpg",
            "updateAt": 1489284256538
        },
        {
            "id": null,
            "inertAt": 1489284256538,
            "name": "Scala新手指南中文版 － 第四篇 Pattern Matching Anonymous Functions(模式匹配匿名函数）",
            "url": "http://lib.csdn.net/article/spark/5850",
            "stage": 1,
            "views": 118,
            "collections": 118,
            "type": "http://lib.csdn.net/base/10",
            "img": "http://img.knowledge.csdn.net/upload/base/1453368118762_762.jpg",
            "updateAt": 1489284256538
        }
    ]

！注意：使用时请自行更改application.properties中的redis配置


  [1]: http://anxpp.com:8765/article/get/stage/1
