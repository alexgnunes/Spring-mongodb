package com.alexgnunes.springWithMongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.alexgnunes.springWithMongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("{ 'Body': { $regex: ?0, $options: 'i' } }")
	List<Post> findByBody(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
