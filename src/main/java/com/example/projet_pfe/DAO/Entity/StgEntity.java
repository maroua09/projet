package com.example.projet_pfe.DAO.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "stagiere")
public class StgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stg_id")
    private Long id;
    @Column(name = "stg_name")
    private String name;
    @Column(name = "stg_datenss")
    private Date datenss;
    @Column(name = "stg_adress")
    private String adress;

    public StgEntity() {

    }

    public StgEntity(Long id, String name, Date datenss, String adress) {
        this.id = id;
        this.name = name;
        this.datenss = datenss;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatenss() {
        return datenss;
    }

    public void setDatenss(Date datenss) {
        this.datenss = datenss;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

