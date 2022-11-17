package com.alexgnunes.springWithMongodb.services;

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
	
	
}
