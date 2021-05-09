package com.news.task.demo.service;

import java.util.List;
import java.util.Optional;

import com.news.task.demo.News;



public interface NewsService {
	
	public List<News> findAll();
	
	public Optional<News> findById(int id);
	
	public void save(News news);
	
	public void deleteById(int id);
	
}
