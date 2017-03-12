package com.anxpp.tinysoft.core.repo;


import com.anxpp.tinysoft.core.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 文章数据访问层
 * Created by anxpp.com on 2017/3/11.
 */
public interface ArticleRepo extends JpaRepository<Article,Long> {
}
