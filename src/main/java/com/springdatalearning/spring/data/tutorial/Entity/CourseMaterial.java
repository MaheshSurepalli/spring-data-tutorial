package com.springdatalearning.spring.data.tutorial.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name="material_sequence",
            sequenceName = "material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_sequence"
    )
    private  Long courseMaterialId;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false

    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    @ToString.Exclude
    private Course course;
}
