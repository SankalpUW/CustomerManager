package com.sankalpdk.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
