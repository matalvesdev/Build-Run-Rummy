package tech.buildrun.ruumye2e.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import java.time.LocalDateTime;

public record BookingRequest(
        Long roomId,
        @JsonFormat(shape = Shape.STRING) LocalDateTime startTime,
        @JsonFormat(shape = Shape.STRING) LocalDateTime endTime
) {
}
