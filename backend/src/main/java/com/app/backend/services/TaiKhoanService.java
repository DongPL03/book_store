package com.app.backend.services;

import com.app.backend.models.NguoiDung;
import com.app.backend.models.ThongBao;
import com.app.backend.repositories.NguoiDungRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaiKhoanService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    private NguoiDungRepository nguoiDungRepository;
    public ResponseEntity<?> dangKyNguoiDung(NguoiDung nguoiDung){
        // Kiểm tra tên đăng nhập đã tồn tại chưa?
        if(nguoiDungRepository.existsByTenDangNhap(nguoiDung.getTenDangNhap())){
            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại."));
        }

        // Kiểm tra email đã tồn tại chưa?
        if(nguoiDungRepository.existsByEmail(nguoiDung.getEmail())){
            return ResponseEntity.badRequest().body(new ThongBao("Email đã tồn tại."));
        }

        // Mã hóa mật khẩu
        String encryptPassword = passwordEncoder.encode(nguoiDung.getMatKhau());
        nguoiDung.setMatKhau(encryptPassword);

        // Lưu người dùng người dùng vào DB
        NguoiDung nguoiDung_daDangKy = nguoiDungRepository.save(nguoiDung);
        return ResponseEntity.ok("Đăng ký thành công");
    }


}

