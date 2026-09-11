package com.aj.conversation.controller;

import com.aj.conversation.model.AnalyticsEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.conversation.dto.AnalyticsEventRequest;
import com.aj.conversation.service.AnalyticsService;

import jakarta.validation.Valid;

@RestController
@Slf4j
@RequestMapping("/api/events")
@CrossOrigin(origins = "http://localhost:4200")
public class AnalyticsController {

    @Autowired
    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @PostMapping
    public ResponseEntity<AnalyticsEvent> trackEvent(
            @Valid @RequestBody AnalyticsEventRequest request
    ) {

        AnalyticsEvent saved = analyticsService.saveEvent(request);

        return ResponseEntity.ok(saved);
    }
}