package com.unitri.sistemamatricula.repository;

import com.unitri.sistemamatricula.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    public List<Document> findByStudentId(Long studentId);
}
