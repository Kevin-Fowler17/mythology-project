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
@Table(name = "domains")
public class Domains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED")
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Characters character;

    @ManyToOne
    @JoinColumn(name = "domain_name_id", nullable = false)
    private DomainName Name;

}
