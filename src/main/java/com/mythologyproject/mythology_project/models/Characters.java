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
@Table(name = "characters")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(10) UNSIGNED")
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "character_type_id", referencedColumnName = "id", nullable = false)
    private CharacterType characterType;

    @ManyToOne
    @JoinColumn(name = "mythology_origin_id", referencedColumnName = "id", nullable = false)
    private MythologyOrigin mythologyOrigin;

    @ManyToMany
    @JoinTable(
            name = "antagonists",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "antagonist_id")
    )
    @ToString.Exclude
    private List<Characters> antagonists;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

}
