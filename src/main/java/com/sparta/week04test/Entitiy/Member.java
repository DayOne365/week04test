package com.sparta.week04test.Entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@Entity
public class Member extends Timestamped {

    @Id
    private Long id;

    private String password;

    private String name;

    private String comment;
}