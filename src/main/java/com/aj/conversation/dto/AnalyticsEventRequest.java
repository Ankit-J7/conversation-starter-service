package com.aj.conversation.dto;

import java.time.Instant;
import java.util.Map;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class AnalyticsEventRequest {

    @NotBlank
    private String sessionId;

    @NotBlank
    private String eventType;

    @NotNull
    private Instant timestamp;

    private Map<String, Object> metadata;

}