package fr.cyclone.ehwaz.repositoriy;

import fr.cyclone.ehwaz.model.db.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IUserRepository extends CrudRepository<User, Long> {
    List<User> findByLastname(String lastname);

    Optional<User> findById(Long id);
}
