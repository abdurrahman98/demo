package com.example.demo.Model;


import com.example.demo.Model.audit.DateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Personel", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "kullanıcıAd"
        }),
        @UniqueConstraint(columnNames = {
                "personelNo"
        })
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Personel extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personelId;
    @NotBlank
    @Size(max = 30)
    private String personelAd;
    @NotBlank
    @Size(max = 30)
    private String personelSoyad;
    @NotBlank
    private String personelNo;
    @NotBlank
    @Size(max = 20)
    private String kullanıcıAd;
    @NotBlank
    @Size(max = 20)
    private String sifre;
    @ManyToMany
    @JoinTable(name = "PersonelRol",
            joinColumns = @JoinColumn(name = "personelId"),
            inverseJoinColumns = @JoinColumn(name = "RolId"))
    private Set<Rol> roller=new HashSet<>();
    @OneToMany(mappedBy = "personel",fetch = FetchType.LAZY)
    private List<Satislar> satıslars=new ArrayList<>();
    @NotBlank
    @Email
    private String Email;












    public Personel() {
    }

    public Personel(@NotBlank @Size(max = 30) String personelAd, @NotBlank @Size(max = 30) String personelSoyad, @NotBlank String personelNo, @NotBlank @Size(max = 20) String kullanıcıAd, @NotBlank @Size(max = 20) String sifre, Set<Rol> roller, List<Satislar> satıslars) {
        this.personelAd = personelAd;
        this.personelSoyad = personelSoyad;
        this.personelNo = personelNo;
        this.kullanıcıAd = kullanıcıAd;
        this.sifre = sifre;
        this.roller = roller;
        this.satıslars = satıslars;
    }

    public Long getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Long personelId) {
        this.personelId = personelId;
    }

    public String getPersonelAd() {
        return personelAd;
    }

    public void setPersonelAd(String personelAd) {
        this.personelAd = personelAd;
    }

    public String getPersonelSoyad() {
        return personelSoyad;
    }

    public void setPersonelSoyad(String personelSoyad) {
        this.personelSoyad = personelSoyad;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }

    public String getKullanıcıAd() {
        return kullanıcıAd;
    }

    public void setKullanıcıAd(String kullanıcıAd) {
        this.kullanıcıAd = kullanıcıAd;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Set<Rol> getRoller() {
        return roller;
    }

    public void setRoller(Set<Rol> roller) {
        this.roller = roller;
    }

    public List<Satislar> getSatıslars() {
        return satıslars;
    }

    public void setSatıslars(List<Satislar> satıslars) {
        this.satıslars = satıslars;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}