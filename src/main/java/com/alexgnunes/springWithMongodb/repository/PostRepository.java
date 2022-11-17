package com.alexgnunes.springWithMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexgnunes.springWithMongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
