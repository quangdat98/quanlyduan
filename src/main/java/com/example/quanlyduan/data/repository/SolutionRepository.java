package com.example.quanlyduan.data.repository;

import com.example.quanlyduan.data.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SolutionRepository extends JpaRepository<Solution,Integer> {
    @Query("select u from dbo_solution u where u.name = :name")
    Solution findOne(@Param("name") String name);
}
