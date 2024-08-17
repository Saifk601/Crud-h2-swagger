package in.saifit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saifit.entity.User;

public interface userRepository extends JpaRepository<User, Serializable> {

}
