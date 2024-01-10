package com.rso.keydash.reportms.interfaces;

import com.rso.keydash.reportms.entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Integer> {
    // You can define custom query methods here
}