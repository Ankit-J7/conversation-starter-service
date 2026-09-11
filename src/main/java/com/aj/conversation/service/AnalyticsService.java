package com.aj.conversation.service;

import com.aj.conversation.dto.AnalyticsEventRequest;
import com.aj.conversation.model.AnalyticsEvent;
import com.aj.conversation.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AnalyticsService {

    @Autowired
    private final EventRepository eventRepository;

    public AnalyticsService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public AnalyticsEvent saveEvent(AnalyticsEventRequest request) {

        try {
            AnalyticsEvent event = new AnalyticsEvent(
                    request.getSessionId(),
                    request.getEventType(),
                    request.getTimestamp(),
                    request.getMetadata()
            );
            AnalyticsEvent saved = eventRepository.save(event);

            System.out.println("Saved event ID: " + saved.getId());
            System.out.println("Saved event type: " + saved.getEventType());

            return saved;
        }
        catch(Exception e)
        {
            log.error("Error"+e);
            return null;
        }
    }
}