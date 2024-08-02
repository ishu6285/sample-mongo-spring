package org.example.demomongoapplication.repository;


import org.example.demomongoapplication.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity,String> {
}
