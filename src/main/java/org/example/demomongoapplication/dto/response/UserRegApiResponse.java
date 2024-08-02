package org.example.demomongoapplication.dto.response;

import lombok.Data;
import org.example.demomongoapplication.entity.UserEntity;

@Data
public class UserRegApiResponse {
    public String message;
    public int status;
    private UserEntity userData;
}
