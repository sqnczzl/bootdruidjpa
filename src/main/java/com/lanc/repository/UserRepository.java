package com.lanc.repository;

import com.lanc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zzl
 * @Date: 2019/3/12 17:49
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, String> {

}
