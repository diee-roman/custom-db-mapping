package com.diee.customdbmapping.model.projection;

import java.util.List;

public record AccountBasicInfo(String username, String email, List<String> roles) {}
