package ru.skprojects.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skprojects.springbootproject.domain.User;

@Repository("users")
public interface UserRepository extends CrudRepository<User,Long> {

    @Override
    void delete(User user);

    @Override
    void deleteAll();

    @Override
    void deleteById(Long id);


}
