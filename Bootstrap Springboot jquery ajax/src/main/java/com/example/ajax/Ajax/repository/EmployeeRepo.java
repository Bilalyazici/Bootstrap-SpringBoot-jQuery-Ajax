package com.example.ajax.Ajax.repository;

import com.example.ajax.Ajax.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Long> {
}
