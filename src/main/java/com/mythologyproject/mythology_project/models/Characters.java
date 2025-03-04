package com.mythologyproject.mythology_project.models;

import jakarta.persistence.*;
import lombok.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "characters")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "INT(10)")
    private long idCharacterType;

    @Column(nullable = false, columnDefinition = "INT(10)")
    private long idMythologyOrigin;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "idCharacterType", referencedColumnName = "id", nullable = false)
    private CharacterType characterType;

    @ManyToOne
    @JoinColumn(name = "idMythologyOrigin", referencedColumnName = "id", nullable = false)
    private MythologyOrigin mythologyOrigin;

}
