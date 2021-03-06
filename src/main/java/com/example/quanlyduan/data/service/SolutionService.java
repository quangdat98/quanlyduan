package com.example.quanlyduan.data.service;

import com.example.quanlyduan.data.model.Solution;

import java.util.List;

public interface SolutionService {
    List<Solution> findAllSoution();

    Solution saveSolution(Solution solution);

    void deleteSolution(Integer id);

    List<Solution> findOne(String name);

    Solution findOneById(Integer id);


}
