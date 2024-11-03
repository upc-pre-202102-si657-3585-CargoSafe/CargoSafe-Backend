package com.dynoware.cargosafe.platform.trips.interfaces.rest.resources;

public record OnGoingTripResource(
        Long id,
        Float latitude,
        Float longitude,
        Integer speed,
        Integer distance
) {
}
