package com.apichurch.dto;

import com.apichurch.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
