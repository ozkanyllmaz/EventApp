package com.event_app.EventApp.service.impl;

import com.event_app.EventApp.dto.UserDto;
import com.event_app.EventApp.entity.User;
import com.event_app.EventApp.mapper.UserMapper;
import com.event_app.EventApp.repository.UserRepository;
import com.event_app.EventApp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }
}
