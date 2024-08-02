package org.example.demomongoapplication.service.serviceImpl;

import org.example.demomongoapplication.dto.request.UserRegApiRequest;
import org.example.demomongoapplication.dto.response.UserRegApiResponse;
import org.example.demomongoapplication.entity.UserEntity;
import org.example.demomongoapplication.repository.UserRepository;
import org.example.demomongoapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserRegApiResponse save(UserRegApiRequest request) {
        UserRegApiResponse response =new UserRegApiResponse();
        try{
            UserEntity save =new UserEntity();
            save.setName(request.getName());
            save.setAge(request.getAge());

            userRepository.save(save);

            response.setMessage("success");
            response.setStatus(200);
            response.setUserData(save);



        }catch (Exception e){
            response.setStatus(400);
            response.setMessage("not success");

        }
        return response;
    }
}
