package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Satıslar")
@Getter
@Setter
public class Satislar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "musteriId", nullable = false)
    private Musteri musteri;

    @OneToMany(mappedBy = "satıslar")
    private List<SatisDetay> satısDetays=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "personelId",nullable = false)
    private Personel personel;



















    public Satislar() {
    }

    public Satislar(Musteri musteri, List<SatisDetay> satısDetays, Personel personel) {
        this.musteri = musteri;
        this.satısDetays = satısDetays;
        this.personel = personel;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public List<SatisDetay> getSatısDetays() {
        return satısDetays;
    }

    public void setSatısDetays(List<SatisDetay> satısDetays) {
        this.satısDetays = satısDetays;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }
}