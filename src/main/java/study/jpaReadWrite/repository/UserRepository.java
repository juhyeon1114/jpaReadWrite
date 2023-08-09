package study.jpaReadWrite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.jpaReadWrite.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
