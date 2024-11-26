package com.event_app.EventApp.mapper;

import com.event_app.EventApp.dto.UserDto;
import com.event_app.EventApp.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getUserId(),
                user.getUserName(),
                user.getPassword(),
                user.getEmail(),
                user.getLocation(),
                user.getInterests(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthDate(),
                user.getGender(),
                user.getPhoneNumber(),
                user.getProfilePhoto()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getUserId(),
                userDto.getUserName(),
                userDto.getPassword(),
                userDto.getEmail(),
                userDto.getLocation(),
                userDto.getInterests(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getBirthDate(),
                userDto.getGender(),
                userDto.getPhoneNumber(),
                userDto.getProfilePhoto()
        );
    }
}
