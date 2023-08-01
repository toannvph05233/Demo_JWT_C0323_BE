package com.springbootjwt.model.dto;

import com.springbootjwt.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountToken {
    private int id;
    private String username;
    private String token;
    private String avatar;
    private Role role;
}
