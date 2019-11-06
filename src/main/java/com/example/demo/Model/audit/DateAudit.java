package com.example.demo.Model.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value ={"olusturulmaTarihi","guncelemeTarih"},
        allowGetters =true
)
@Getter
@Setter
public abstract class DateAudit implements Serializable {
    @CreatedDate
    private Instant olusturulmaTarihi;
    @LastModifiedDate
    private Instant gulcelemeTarih;








    public Instant getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(Instant olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public Instant getGulcelemeTarih() {
        return gulcelemeTarih;
    }

    public void setGulcelemeTarih(Instant gulcelemeTarih) {
        this.gulcelemeTarih = gulcelemeTarih;
    }
}