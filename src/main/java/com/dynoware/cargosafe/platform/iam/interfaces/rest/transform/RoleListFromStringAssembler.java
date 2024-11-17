package com.dynoware.cargosafe.platform.iam.interfaces.rest.transform;

import com.dynoware.cargosafe.platform.iam.domain.model.entities.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Assembler to convert a list of role names to a list of Role entities.
 * <p>
 *     This class is used to convert a list of role names to a list of Role entities.
 * </p>
 */
public class RoleListFromStringAssembler {
    /**
     * Converts a list of role names to a list of Role entities.
     *
     * @param resourceList The list of role names to convert.
     * @return The list of Role entities.
     */
    public static List<Role> toRoleListFromStringList(List<String> resourceList) {
        return resourceList.stream()
                .map(Role::toRoleFromName)
                .toList();
    }
}
