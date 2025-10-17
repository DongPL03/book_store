package com.app.backend.repositories;

import com.app.backend.models.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "nguoi-dung")
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    boolean existsByTenDangNhap(String tenDangNhap);

    boolean existsByEmail(String email);
    public NguoiDung findByTenDangNhap(String tenDangNhap);
}
