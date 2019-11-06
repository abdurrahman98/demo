package com.example.demo.Model;


import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "Kategori")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Kategori {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kategoriID;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 40)
    private Kategoriler kategoriler;










    public Kategori() {
    }

    public Kategori(Kategoriler kategoriler) {
        this.kategoriler = kategoriler;
    }

    public Long getKategoriID() {
        return kategoriID;
    }

    public void setKategoriID(Long kategoriID) {
        this.kategoriID = kategoriID;
    }

    public Kategoriler getKategoriler() {
        return kategoriler;
    }

    public void setKategoriler(Kategoriler kategoriler) {
        this.kategoriler = kategoriler;
    }
}