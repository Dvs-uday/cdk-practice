package com.project1.springboot.tickets.events;

import java.time.LocalDate;

public record Event(
        int id,
        String name,

        Organizer organizer,
        Venue venue,
        LocalDate startDate,
        LocalDate endDate
) {
}