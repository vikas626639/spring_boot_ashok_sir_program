package com.nit.Repointerface;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nit.bean.ContectmasterEntity;
@Repository
public interface ContectMaster extends CrudRepository<ContectmasterEntity, Serializable> {
//this is marker interface take entity class and provide implementation on runtime
	public ContectmasterEntity findByContectNumber(Long  number);
	public ContectmasterEntity findByContectName(String name);
}
