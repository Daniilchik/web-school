package org.mdasolutions.web.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reviews_seq")
    @SequenceGenerator(name = "reviews_seq", sequenceName = "reviews_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "text")
    private String text;
}
