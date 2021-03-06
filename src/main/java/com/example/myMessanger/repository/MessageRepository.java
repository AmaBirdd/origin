package com.example.myMessanger.repository;

import com.example.myMessanger.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {

}
