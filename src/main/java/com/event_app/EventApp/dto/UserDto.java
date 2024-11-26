package com.event_app.EventApp.dto;

import com.event_app.EventApp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int userId;
    private String userName;
    private String password;
    private String email;
    private String location;
    private List<String> interests;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender;
    private String phoneNumber;
    private String profilePhoto;




}
