package com.dynoware.cargosafe.platform.trips.domain.services;

import com.dynoware.cargosafe.platform.trips.domain.model.aggregates.Trip;
import com.dynoware.cargosafe.platform.trips.domain.model.commands.CreateTripCommand;
import com.dynoware.cargosafe.platform.trips.domain.model.commands.DeleteTripCommand;
import com.dynoware.cargosafe.platform.trips.domain.model.commands.UpdateTripCommand;

import java.util.Optional;

public interface TripCommandService {
    Optional<Trip> handle(CreateTripCommand command);
    Optional<Trip> handle(UpdateTripCommand command);
    void handle(DeleteTripCommand command);
}