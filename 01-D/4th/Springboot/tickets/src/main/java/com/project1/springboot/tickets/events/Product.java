package com.project1.springboot.tickets.events;

import java.math.BigDecimal;

public record Product(
        int id,
        int eventId,
        String name,
        String Description,
        BigDecimal price) {
}
