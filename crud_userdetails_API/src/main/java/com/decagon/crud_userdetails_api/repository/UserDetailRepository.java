package com.decagon.crud_userdetails_api.repository;

import com.decagon.crud_userdetails_api.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Long> {

}
