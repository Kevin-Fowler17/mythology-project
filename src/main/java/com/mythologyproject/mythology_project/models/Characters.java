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

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "character_type_id", referencedColumnName = "id", nullable = false)
    private CharacterType characterType;

    @ManyToOne
    @JoinColumn(name = "mythology_origin_id", referencedColumnName = "id", nullable = false)
    private MythologyOrigin mythologyOrigin;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Titles> titles;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<FamilyRelations> familyRelations;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Domains> domains;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Symbols> symbols;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Powers> powers;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<KeyTraits> keyTraits;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Myths> myths;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<FunFacts> funFacts;

    @ManyToMany
    @JoinTable(
            name = "antagonists",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "antagonist_id")
    )
    @ToString.Exclude
    private List<Characters> antagonists;

}
