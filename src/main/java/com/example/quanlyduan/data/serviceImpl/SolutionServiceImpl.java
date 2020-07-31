package com.example.quanlyduan.data.serviceImpl;

import com.example.quanlyduan.data.model.Solution;
import com.example.quanlyduan.data.repository.SolutionRepository;
import com.example.quanlyduan.data.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionServiceImpl implements SolutionService {

    private SolutionRepository solutionRepository;
    @Autowired
    public void setSolutionRepository(SolutionRepository solutionRepository) {
        this.solutionRepository = solutionRepository;
    }

    @Override
    public List<Solution> findAllSoution() {
        return solutionRepository.findAll();
    }

    @Override
    public Solution saveSolution(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public void deleteSolution(Integer id) {
        solutionRepository.deleteById(id);
    }

    @Override
    public List<Solution> findOne(String name) {
        return solutionRepository.findOne(name);
    }

    @Override
    public Solution findOneById(Integer id) {
        return solutionRepository.getOne(id);
    }


}
