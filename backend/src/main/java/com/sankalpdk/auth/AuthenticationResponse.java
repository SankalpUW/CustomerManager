package com.sankalpdk.auth;

import com.sankalpdk.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
