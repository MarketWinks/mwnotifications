package com.marketwinks.mwnotifications.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marketwinks.mwnotifications.model.notification;

@Repository
public interface NotificationRepository extends MongoRepository<notification, String> {
}
