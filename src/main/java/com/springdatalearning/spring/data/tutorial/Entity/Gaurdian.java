package com.springdatalearning.spring.data.tutorial.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name="name",
                column = @Column(name = "gaurdian_name")
        ),
        @AttributeOverride(
                name="email",
                column = @Column(name="gaurdian_email")
        ),
        @AttributeOverride(
                name="mobile",
                column = @Column(name="gaurdian_mobile")
        )
}
)
public class Gaurdian {
    private String name;
    private String email;
    private String mobile;
}
