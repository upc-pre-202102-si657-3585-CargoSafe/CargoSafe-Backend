package com.dynoware.cargosafe.platform.profiles.domain.services;

import com.dynoware.cargosafe.platform.profiles.domain.model.aggregates.Profile;
import com.dynoware.cargosafe.platform.profiles.domain.model.commands.CreateProfileCommand;
import com.dynoware.cargosafe.platform.profiles.domain.model.commands.UpdateProfileCommand;

import java.util.Optional;

/**
 * Profile Command Service
 */
public interface ProfileCommandService {
    /**
     * Handle Create Profile Command
     *
     * @param command The {@link CreateProfileCommand} Command
     * @return A {@link Profile} instance if the command is valid, otherwise empty
     * @throws IllegalArgumentException if the email address already exists
     */
    Optional<Profile> handle(CreateProfileCommand command);

    Optional<Profile> handle(UpdateProfileCommand command);

    /**
     * Delete a profile by ID
     *
     * @param profileId The profile ID
     * @return True if the profile was deleted, otherwise false
     */
    boolean delete(Long profileId);
}
