package com.example.projet_pfe.service;
import com.example.projet_pfe.DAO.Entity.StgEntity;
import java.util.List;
import java.util.Optional;

public interface StgService {
    List<StgEntity> findAllStg();
    Optional<StgEntity> findById(Long id);
    StgEntity saveStg(StgEntity stgEntity);

    StgEntity updateStg(StgEntity stgEntity);

    void deleteStg(Long id);
}
