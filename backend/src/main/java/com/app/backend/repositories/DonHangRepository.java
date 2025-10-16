package com.app.backend.repositories;

import com.app.backend.models.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "don-hang")
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}