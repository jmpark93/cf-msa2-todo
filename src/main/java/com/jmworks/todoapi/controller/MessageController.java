package com.jmworks.todoapi.controller;

import com.jmworks.todoapi.payload.UserCommand;
import com.jmworks.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MessageController {

    @Autowired
    private TodoRepository todoRepository;

    @StreamListener(target = Sink.INPUT)
    public void processMessage(UserCommand usrCmd)
    {
        if( "DEL".equalsIgnoreCase( usrCmd.getOper() ) ) {
            System.out.println( "User(" + usrCmd.getId() + ") will be deleted ... ");
            todoRepository.deleteAllByUserID(usrCmd.getId());
        }
    }
}
