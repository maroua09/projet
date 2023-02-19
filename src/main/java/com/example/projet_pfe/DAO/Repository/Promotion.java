package com.example.projet_pfe.DAO.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Promotion extends JpaRepository<com.example.projet_pfe.DAO.Entity.Promotion, String> {
}
