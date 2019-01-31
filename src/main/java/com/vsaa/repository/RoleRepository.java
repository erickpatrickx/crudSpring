package com.vsaa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vsaa.modelo.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
