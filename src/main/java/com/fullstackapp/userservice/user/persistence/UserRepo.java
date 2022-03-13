package com.fullstackapp.userservice.user.persistence;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ReactiveMongoRepository {

}
