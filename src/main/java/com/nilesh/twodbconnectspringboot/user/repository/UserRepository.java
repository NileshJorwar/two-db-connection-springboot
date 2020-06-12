package com.nilesh.twodbconnectspringboot.user.repository;

import com.nilesh.twodbconnectspringboot.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserClass, Long> {

}
