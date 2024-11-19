package com.MCC.BCA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @Column(name = "upload_date")
    private String uploadDate;

    public Gallery(String url, String uploadDate) {
        this.url = url;
        this.uploadDate = uploadDate;
    }
    public Gallery(){}
}
