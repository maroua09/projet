package com.example.projet_pfe.service.impl;

import com.example.projet_pfe.DAO.Entity.StgEntity;
import com.example.projet_pfe.DAO.Repository.StgRepository;
import com.example.projet_pfe.service.StgService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StgServiceimpl implements StgService {
    private final StgRepository stgRepository;

    public StgServiceimpl(StgRepository stgRepository) {
        this.stgRepository = stgRepository;
    }

    @Override
    public List<StgEntity> findAllStg() {
        return stgRepository.findAll();
    }

    @Override
    public Optional<StgEntity> findById(Long id) {
        return stgRepository.findById(id);
    }

    @Override
    public StgEntity saveStg(StgEntity stgEntity) {
        return stgRepository.save(stgEntity);
    }
    @Override
    public StgEntity updateStg(StgEntity stgEntity) {
        return stgRepository.save(stgEntity);
    }
    @Override
    public void deleteStg(Long id) {
        stgRepository.deleteById(id);
    }
}
