package com.seonjuleee.karrotmarket.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="product")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private Long status;
    @Column
    private String image;
    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;
}
