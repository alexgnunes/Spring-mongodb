package com.alexgnunes.springWithMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexgnunes.springWithMongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
