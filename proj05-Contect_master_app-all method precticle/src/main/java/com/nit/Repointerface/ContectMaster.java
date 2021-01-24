package com.nit.Repointerface;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nit.bean.Contect_master;
@Repository
public interface ContectMaster extends CrudRepository<Contect_master, Serializable> {
//this is marker interface take entity class and provide implementation on runtime
}
