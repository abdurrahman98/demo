package com.example.demo.Model;


import com.example.demo.Model.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Ilac")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Ilac extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ilacId;
    private String ilacAd;
    private byte[] resim;
    private double ilacFiyat;
    private int stok;
    private int birimMiktar;

    @ManyToMany
    @JoinTable(name ="IlacKategori",
            joinColumns = @JoinColumn(name = "ilacID"),
            inverseJoinColumns = @JoinColumn(name = "kategoriId"))
    private List<Kategori> kategoris=new ArrayList<>();

    @OneToMany(mappedBy = "ilac")
    private List<SatisDetay>satısDetays=new ArrayList<>();









    public Ilac() {
    }

    public Ilac(String ilacAd, byte[] resim, double ilacFiyat, int stok, int birimMiktar, List<Kategori> kategoris, List<SatisDetay> satısDetays) {
        this.ilacAd = ilacAd;
        this.resim = resim;
        this.ilacFiyat = ilacFiyat;
        this.stok = stok;
        this.birimMiktar = birimMiktar;
        this.kategoris = kategoris;
        this.satısDetays = satısDetays;
    }

    public Long getIlacId() {
        return ilacId;
    }

    public void setIlacId(Long ilacId) {
        this.ilacId = ilacId;
    }

    public String getIlacAd() {
        return ilacAd;
    }

    public void setIlacAd(String ilacAd) {
        this.ilacAd = ilacAd;
    }

    public byte[] getResim() {
        return resim;
    }

    public void setResim(byte[] resim) {
        this.resim = resim;
    }

    public double getIlacFiyat() {
        return ilacFiyat;
    }

    public void setIlacFiyat(double ilacFiyat) {
        this.ilacFiyat = ilacFiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getBirimMiktar() {
        return birimMiktar;
    }

    public void setBirimMiktar(int birimMiktar) {
        this.birimMiktar = birimMiktar;
    }

    public List<Kategori> getKategoris() {
        return kategoris;
    }

    public void setKategoris(List<Kategori> kategoris) {
        this.kategoris = kategoris;
    }

    public List<SatisDetay> getSatısDetays() {
        return satısDetays;
    }

    public void setSatısDetays(List<SatisDetay> satısDetays) {
        this.satısDetays = satısDetays;
    }
}