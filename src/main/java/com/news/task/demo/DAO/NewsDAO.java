package com.news.task.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.news.task.demo.News;
@Repository
public interface NewsDAO   extends JpaRepository<News, Integer> {

}
