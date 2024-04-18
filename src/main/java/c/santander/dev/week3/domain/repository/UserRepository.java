package c.santander.dev.week3.domain.repository;

import c.santander.dev.week3.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByIdAccountNumber(String number);
    boolean existsByCardNumber(String number);
}
