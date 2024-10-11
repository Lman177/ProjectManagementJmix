package com.company.projectmanagement.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "CombineManagerRole", code = CombineManagerRole.CODE)
public interface CombineManagerRole extends ProjectManagerRole, UiMinimalRole {
    String CODE = "combine-manager-role";
}