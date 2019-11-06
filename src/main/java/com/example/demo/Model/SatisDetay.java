package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SatısDetay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SatisDetay implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "ilacId", referencedColumnName = "ilacId")
    private Ilac ilac;
    @Id
    @ManyToOne
    @JoinColumn(name = "satıslarId", referencedColumnName = "id")
    private Satislar satıslar;

    private double birimFiyat;
    private int miktar;
    private double toplamTutar;

























    public SatisDetay() {
    }

    public SatisDetay(Ilac ilac, Satislar satıslar, double birimFiyat, int miktar, double toplamTutar) {
        this.ilac = ilac;
        this.satıslar = satıslar;
        this.birimFiyat = birimFiyat;
        this.miktar = miktar;
        this.toplamTutar = toplamTutar;
    }

    public Ilac getIlac() {
        return ilac;
    }

    public void setIlac(Ilac ilac) {
        this.ilac = ilac;
    }

    public Satislar getSatıslar() {
        return satıslar;
    }

    public void setSatıslar(Satislar satıslar) {
        this.satıslar = satıslar;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(double toplamTutar) {
        this.toplamTutar = toplamTutar;
    }
}