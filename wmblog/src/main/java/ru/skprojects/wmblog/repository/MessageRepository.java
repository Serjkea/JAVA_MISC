package ru.skprojects.wmblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.skprojects.wmblog.model.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    List<Message> findAll();

    @Override
    <S extends Message> S save(S s);

    ;

}
