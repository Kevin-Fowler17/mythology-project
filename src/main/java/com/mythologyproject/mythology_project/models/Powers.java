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
@Table(name = "powers")
public class Powers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED")
    private long id;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Characters character;

    @ManyToOne
    @JoinColumn(name = "power_name_id", nullable = false)
    private PowerName powerName;

    @ManyToOne
    @JoinColumn(name = "power_type_id", nullable = false)
    private PowerType powerType;

}
