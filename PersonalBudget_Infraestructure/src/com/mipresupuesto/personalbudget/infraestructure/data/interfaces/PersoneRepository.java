package com.mipresupuesto.personalbudget.infraestructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mipresupuesto.personalbudget.entity.PersonEntity;

public interface PersoneRepository extends JpaRepository<PersonEntity, UUID>{

}
