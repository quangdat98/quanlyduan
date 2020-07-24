package com.example.quanlyduan.data.repository;

import com.example.quanlyduan.data.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolutionRepository extends JpaRepository<Solution,Integer> {

}
