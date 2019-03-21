package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//Spring Data предоставляет абстракцию CrudRepository, которая типизируется целевой сущностью
//  и её id. CrudRepository имеет набор базовых методов для работы с сущностью, названия которых говорят сами за себя:
public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
    List<Message> findAllByOrderByTextDesc();
}
