package com.jmworks.todoapi.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userID;

    private String todoItem;

    private String memo;

    @Column(columnDefinition = "boolean default false")
    private Boolean isDone;

    @Column(columnDefinition = "boolean default false")
    private Boolean isImportant;

    @Column(columnDefinition = "boolean default false")
    private Boolean isToday;

    @CreationTimestamp
    private LocalDateTime createdTimeAt;
    @UpdateTimestamp
    private LocalDateTime updateTimeAt;

}