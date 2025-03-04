package com.mythologyproject.mythology_project.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "fun_facts")
public class FunFacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED")
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Characters character;

    @Column(nullable = false)
    private String fact;

}
