package com.leosmp.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leosmp.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
