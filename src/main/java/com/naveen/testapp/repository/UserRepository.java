package com.naveen.testapp.repository;

import com.naveen.testapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> { }
