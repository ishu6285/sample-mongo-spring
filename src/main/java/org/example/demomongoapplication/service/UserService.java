package org.example.demomongoapplication.service;

import org.example.demomongoapplication.dto.request.UserRegApiRequest;
import org.example.demomongoapplication.dto.response.UserRegApiResponse;

public interface UserService {
    UserRegApiResponse save(UserRegApiRequest request);
}
