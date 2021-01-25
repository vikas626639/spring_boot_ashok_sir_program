package com.nit.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.emp;

public interface EmployeeRepo extends JpaRepository<emp, Serializable> {
	@Query("select ENAME,JOB from emp where ENAME=:ename")
	public List<String> findENAMEByJOB(String ename);
}
