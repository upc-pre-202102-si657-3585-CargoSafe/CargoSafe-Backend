package com.dynoware.cargosafe.platform.iam.interfaces.rest.transform;

import com.dynoware.cargosafe.platform.iam.domain.model.aggregates.User;
import com.dynoware.cargosafe.platform.iam.interfaces.rest.resources.AuthenticatedUserResource;

/**
 * Assembler to convert a User entity to an AuthenticatedUserResource.
 * <p>
 *     This class is used to convert a User entity to an AuthenticatedUserResource.
 * </p>
 */
public class AuthenticatedUserResourceFromEntityAssembler {
    /**
     * Converts a User entity to an AuthenticatedUserResource.
     *
     * @param entity The User entity to convert.
     * @param token The token to include in the AuthenticatedUserResource.
     * @return The AuthenticatedUserResource.
     */
    public static AuthenticatedUserResource toResourceFromEntity(User entity, String token) {
        var roles = RoleStringListFromEntityListAssembler.toResourceListFromEntitySet(entity.getRoles());
        return new AuthenticatedUserResource(
                entity.getId(),
                entity.getUsername(),
                token,
                roles);
    }
}
