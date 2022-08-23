package com.simpleform.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "musteri_table")
public class MusteriModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;

    String emlakTur;

    Integer metrekare;

    Integer odaSayi;

    Integer kat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmlakTur() {
        return emlakTur;
    }

    public void setEmlakTur(String emlakTur) {
        this.emlakTur = emlakTur;
    }

    public Integer getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(Integer metrekare) {
        this.metrekare = metrekare;
    }

    public Integer getOdaSayi() {
        return odaSayi;
    }

    public void setOdaSayi(Integer odaSayi) {
        this.odaSayi = odaSayi;
    }

    public Integer getKat() {
        return kat;
    }

    public void setKat(Integer kat) {
        this.kat = kat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusteriModel that = (MusteriModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(emlakTur, that.emlakTur) &&
                Objects.equals(metrekare, that.metrekare) &&
                Objects.equals(odaSayi, that.odaSayi) &&
                Objects.equals(kat, that.kat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emlakTur, metrekare, odaSayi, kat);
    }

    @Override
    public String toString() {
        return "MusteriModel{" +
                "id=" + id +
                ", emlakTur='" + emlakTur + '\'' +
                ", metrekare=" + metrekare +
                ", odaSayi=" + odaSayi +
                ", kat=" + kat +
                '}';
    }
}
