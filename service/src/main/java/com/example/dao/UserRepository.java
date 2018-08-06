package com.example.dao;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author miou
 * @date 2018/8/6
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
