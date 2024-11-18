package com.dynoware.cargosafe.platform.profiles.interfaces.rest.resources;

public record UpdateProfileResource(
        String firstName,
        String lastName,
        String email,
        String street,
        String number,
        String city,
        String postalCode,
        String country) {
}