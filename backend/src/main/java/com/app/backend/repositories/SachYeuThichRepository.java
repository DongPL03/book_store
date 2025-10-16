package com.app.backend.repositories;

import com.app.backend.models.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sach-yeu-thich")
public interface SachYeuThichRepository extends JpaRepository<SachYeuThich, Integer> {
}
