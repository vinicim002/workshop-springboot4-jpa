package com.vinicius.course.repositories;

import com.vinicius.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository extends JpaRepository<User, Long> {
}
