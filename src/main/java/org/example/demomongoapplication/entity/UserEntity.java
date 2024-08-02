package org.example.demomongoapplication.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class UserEntity {


        @Id
        private String id;
        private String name;
        private String age;


}
