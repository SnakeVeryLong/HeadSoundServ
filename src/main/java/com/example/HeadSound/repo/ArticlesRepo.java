package com.example.HeadSound.repo;

import com.example.HeadSound.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepo extends JpaRepository<Article, Integer> {

    // List<Article>

}
