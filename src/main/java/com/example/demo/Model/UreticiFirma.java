package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "UreticiFirma")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UreticiFirma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uFirmaId;
    private String telefonNo;









    public UreticiFirma() {
    }

    public UreticiFirma(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Long getuFirmaId() {
        return uFirmaId;
    }

    public void setuFirmaId(Long uFirmaId) {
        this.uFirmaId = uFirmaId;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}