package com.xapps.nexos.repositories;

import com.xapps.nexos.models.Messages;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessagesRepository extends MongoRepository<Messages, String> {
    Messages findBy_id(ObjectId _id);
}