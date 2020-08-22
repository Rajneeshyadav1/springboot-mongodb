package com.cts.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
