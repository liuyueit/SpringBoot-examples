package io.github.biezhi.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by biezhi on 2017/3/26.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
