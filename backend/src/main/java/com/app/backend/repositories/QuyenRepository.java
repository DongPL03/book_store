package com.app.backend.repositories;

import com.app.backend.models.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "quyen")
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
    public Quyen findByTenQuyen(String tenQuyen);
}