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
public class Character {

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
    private List<Title> titles;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<FamilyRelation> familyRelations;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Domain> domains;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Symbol> symbols;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Power> powers;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<KeyTrait> keyTraits;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<Myth> myths;

    @OneToMany(mappedBy = "character")
    @ToString.Exclude
    private List<FunFact> funFacts;

    @ManyToMany
    @JoinTable(
            name = "antagonists",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "antagonist_id")
    )
    @ToString.Exclude
    private List<Character> antagonists;

}
