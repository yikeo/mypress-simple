package com.yikeo.mypress.modules.account.entity;

import com.yikeo.mypress.common.entity.BaseEntity;
import org.springframework.security.core.GrantedAuthority;

public class Role extends BaseEntity implements GrantedAuthority {

    private String authority;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
