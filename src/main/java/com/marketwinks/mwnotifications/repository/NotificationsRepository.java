package com.marketwinks.mwnotifications.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marketwinks.mwnotifications.model.notifications;

@Repository
public interface NotificationsRepository extends MongoRepository<notifications, String> {
}
