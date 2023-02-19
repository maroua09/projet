package com.example.projet_pfe.DAO.Repository;

import com.example.projet_pfe.DAO.Entity.StgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StgRepository extends JpaRepository<StgEntity, Long> { }

