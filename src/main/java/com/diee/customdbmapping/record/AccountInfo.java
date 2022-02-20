package com.diee.customdbmapping.record;

import java.time.LocalDateTime;
import java.util.List;

public record AccountInfo(Long userId, String username, String password, String email, LocalDateTime createdOn, LocalDateTime lastLogin,
                          List<String> roles) {}
