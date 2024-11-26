package com.event_app.EventApp.repository;

import com.event_app.EventApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
