package com.example.demo.Model;


import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Musteri")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Musteri {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long musteriId;
    private String musteriAd;
    private String musteriSoyad;
    private String numara;
    private String adres;

    @OneToMany(mappedBy = "musteri",

            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @Fetch(FetchMode.SELECT)
    private List<Satislar> satıslar=new ArrayList<>();





















    public Musteri() {
    }

    public Musteri(String musteriAd, String musteriSoyad, String numara, String adres, List<Satislar> satıslar) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.numara = numara;
        this.adres = adres;
        this.satıslar = satıslar;
    }

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Satislar> getSatıslar() {
        return satıslar;
    }

    public void setSatıslar(List<Satislar> satıslar) {
        this.satıslar = satıslar;
    }
}