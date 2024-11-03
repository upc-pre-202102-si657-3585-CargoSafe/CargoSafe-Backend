package com.dynoware.cargosafe.platform.trips.domain.model.queries;

public record GetExpenseByIdQuery(Long id) {
    public GetExpenseByIdQuery {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
    }
}