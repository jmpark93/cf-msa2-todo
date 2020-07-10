package com.jmworks.todoapi.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCommand {
    String oper;
    Long id;
}
