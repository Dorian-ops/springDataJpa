package https.github.com.Dorian_ops.diamonds_bank_spring.repositoryes;


import https.github.com.Dorian_ops.diamonds_bank_spring.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Long>{

    UserModel save(UserModel person);

    Optional<UserModel> findById(long id);

}
