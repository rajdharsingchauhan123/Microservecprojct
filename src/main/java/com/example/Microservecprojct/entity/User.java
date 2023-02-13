package com.example.Microservecprojct.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "micro_user")
public class User {
    @Id

    private String userId;
    private String name;
    private String email;
    private  String about;
@Transient
    private List<Rating>ratings;

}
