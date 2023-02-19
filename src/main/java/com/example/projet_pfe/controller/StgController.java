package com.example.projet_pfe.controller;

import com.example.projet_pfe.DAO.Entity.StgEntity;
import com.example.projet_pfe.service.StgService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stagiere")
public class StgController {
    private final StgService stgService;

    public StgController(StgService stgService) {
        this.stgService = stgService;
    }
    @GetMapping
    public List<StgEntity> findAllStg(){
        return stgService.findAllStg();
    }
    public Optional<StgEntity> findStgById(@PathVariable("id") Long id){
        return stgService.findById(id);
    }
    @PostMapping
    public StgEntity saveStg(@RequestBody StgEntity stgEntity){
        return stgService.saveStg(stgEntity);
    }
    @PutMapping
    public StgEntity updateStg(@RequestBody StgEntity stgEntity){
        return stgService.updateStg(stgEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteStg(@PathVariable("id") Long id){
        stgService.deleteStg(id);
    }
}
