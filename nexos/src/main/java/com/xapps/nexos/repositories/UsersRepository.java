package com.xapps.nexos.repositories;

import com.xapps.nexos.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUsername(String username);
}