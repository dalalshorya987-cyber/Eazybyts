package com.chatapp.chatapp.repository;


import com.chatapp.chatapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

