package org.home.dispute.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.home.dispute.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
