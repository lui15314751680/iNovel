package com.example.zjsu.repository;

import com.example.zjsu.entity.userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userinfoRepository extends JpaRepository<userinfo, Integer> {
    userinfo findByUname(String uname);
}
