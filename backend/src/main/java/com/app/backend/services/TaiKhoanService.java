package com.app.backend.services;

import com.app.backend.models.NguoiDung;
import com.app.backend.models.ThongBao;
import com.app.backend.repositories.NguoiDungRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaiKhoanService {
    private NguoiDungRepository nguoiDungRepository;

    public ResponseEntity<?> dangKyNguoiDung(NguoiDung nguoiDung){
        // Kiểm tra tên đăng nhập đã tồn tại chưa?
        if(nguoiDungRepository.existsByTenDangNhap(nguoiDung.getTenDangNhap())){
            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại."));
        }

        // Kiểm traemail đã tồn tại chưa?
        if(nguoiDungRepository.existsByEmail(nguoiDung.getEmail())){
            return ResponseEntity.badRequest().body(new ThongBao("Email đã tồn tại."));
        }

        // Lưu người dùng người dùng vào DB
        NguoiDung nguoiDung_daDangKy = nguoiDungRepository.save(nguoiDung);
        return ResponseEntity.ok("Đăng ký thành công");
    }

}

