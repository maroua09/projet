package com.example.projet_pfe.DAO.Entity;
import jakarta.persistence.*;
import java.util.Date;

public class Promotion {
    @Entity
    @Table(name = "PROMOTION", schema = "USERS")
    public class Promotion {

        @Id
        @Column(name = "CODE_PROM")
        private String codeProm;

        @Column(name = "CODE_PROM3", length = 5)
        private String codeProm3;

        @Column(name = "CODE_ACT", nullable = false)
        private int codeAct;

        @Column(name = "CODE_RESP", nullable = false)
        private int codeResp;

        @Column(name = "LIB_PROMO", nullable = false, length = 40)
        private String libPromo;

        @Column(name = "DATE_D_F", nullable = false)
        private Date dateDF;

        @Column(name = "DATE_F")
        private Date dateF;

        @Column(name = "NB_EQUIPE")
        private int nbEquipe;

        @Column(name = "NB_STAG", columnDefinition = "NUMBER(2) DEFAULT 12")
        private int nbStag;

        @Column(name = "DATE_RETOUR")
        private Date dateRetour;

        @Column(name = "DATE_F_PREV")
        private Date dateFPrev;

        @Column(name = "CODE_PHA_EXAM", length = 7)
        private String codePhaExam;

        @Column(name = "COEF_PHA_EXAM", columnDefinition = "NUMBER(2) DEFAULT 1")
        private int coefPhaExam;

        @Column(name = "DATE_JURY")
        private Date dateJury;

        @Column(name = "GSP", length = 10)
        private String gsp;

        @Column(name = "TYPE_HORAIRE", length = 3, columnDefinition = "CHAR(3 BYTE) DEFAULT 'FPS' NOT NULL")
        private String typeHoraire;

        @Column(name = "IMPUTATION", length = 8)
        private String imputation;

        public Promotion() {}

        // getters and setters
    }
}
