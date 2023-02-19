package com.example.projet_pfe.DAO.Entity;

import jakarta.persistence.*;

    @Entity
    @Table(name = "Branche")
    public class Branche {

        @Id
        @Column(name = "CODE_BR")
        private Integer codeBr;

        @Column(name = "DESIGN_BR")
        private String designBr;

        @Column(name = "COULEUR")
        private String couleur;

        @Column(name = "IMPUT")
        private String imput;

        @Column(name = "CODE_SUB")
        private Integer codeSub;

        @Column(name = "CODE_DOM")
        private Integer codeDom;

        public Branche (int i, String design1, String couleur1, String imput1, int i1, int i2) {
        }

        public Branche() {

        }

        // getters and setters
    }

