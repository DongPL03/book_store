package com.app.backend.services;

import com.app.backend.models.NguoiDung;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public NguoiDung findByUsername(String tenDangNhap);
}
