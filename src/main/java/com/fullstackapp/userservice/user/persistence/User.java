package com.fullstackapp.userservice.user.persistence;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "users")
public class User {

    @Id
    private String id;
    @Indexed(unique = true)
    private String userName;
    @Indexed(unique = true)
    private String email;
    private String profilePictureURL;

}
