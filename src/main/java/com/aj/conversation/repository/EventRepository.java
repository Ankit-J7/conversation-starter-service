package com.aj.conversation.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aj.conversation.model.AnalyticsEvent;

public interface EventRepository
        extends MongoRepository<AnalyticsEvent, ObjectId> {

    List<AnalyticsEvent> findBySessionIdOrderByTimestampAsc(
            String sessionId
    );
}