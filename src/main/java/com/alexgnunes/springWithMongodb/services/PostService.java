package com.alexgnunes.springWithMongodb.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexgnunes.springWithMongodb.domain.Post;
import com.alexgnunes.springWithMongodb.repository.PostRepository;
import com.alexgnunes.springWithMongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
		
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		} 
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
	
	public List<Post> findByBody(String text){
		return repo.findByBody(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime()+ 24*60*60*1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
}
