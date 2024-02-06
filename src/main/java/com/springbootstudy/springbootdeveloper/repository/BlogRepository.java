package com.springbootstudy.springbootdeveloper.repository;

import com.springbootstudy.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
