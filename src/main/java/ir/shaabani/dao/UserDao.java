package ir.shaabani.dao;

import ir.shaabani.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.firstName = :firstName")
    public List<User> findByFirstName(@Param("firstName") String firstName);
}
