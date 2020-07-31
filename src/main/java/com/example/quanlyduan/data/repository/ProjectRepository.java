package com.example.quanlyduan.data.repository;

import com.example.quanlyduan.data.model.EmployeeSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<EmployeeSolution,Integer> {
    @Query("select u from dbo_employee_solution u where u.id = :id")
    EmployeeSolution findOneEmployeeSolution(@Param("id") int id);


    @Query("select u from dbo_employee_solution u where u.solution_id =:id")
    List<EmployeeSolution> findUserNameBySolutionID(@Param("id") int id);
}
