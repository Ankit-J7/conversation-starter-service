package com.aj.conversation.model;

import java.time.Instant;
import java.util.Map;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "analytics_events")
public class AnalyticsEvent {

    @Id
    private String id;

    private String sessionId;
    private String eventType;
    private Instant timestamp;
    private Map<String, Object> metadata;

    public AnalyticsEvent(
            String sessionId,
            String eventType,
            Instant timestamp,
            Map<String, Object> metadata
    ) {
        this.sessionId = sessionId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

}