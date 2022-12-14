package com.mipresupuesto.personalbudget.infraestructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mipresupuesto.personalbudget.entity.BudgetEntity;

//Es un Bean;Inversión de dependencias 
@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, UUID> {

}
