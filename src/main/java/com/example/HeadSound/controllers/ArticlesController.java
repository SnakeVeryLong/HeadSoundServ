package com.example.HeadSound.controllers;

import ch.qos.logback.core.model.Model;
import com.example.HeadSound.entity.Article;
import com.example.HeadSound.repo.ArticlesRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArticlesController {

    private final ArticlesRepo articlesRepo;

    public ArticlesController(ArticlesRepo articlesRepo) {
        this.articlesRepo = articlesRepo;
    }

    @GetMapping("/articles")
    @ResponseBody
    public List<Article> Articles (Model model) {
        List<Article> list = articlesRepo.findAll();
        return list;
    }
}
