package com.example.zjsu.repository;

import com.example.zjsu.entity.ebookinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ebookinfoRespository extends JpaRepository<ebookinfo, Integer> {
   ebookinfo findByEname(String ename);
}
