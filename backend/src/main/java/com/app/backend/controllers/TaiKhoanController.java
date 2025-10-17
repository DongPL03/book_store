package com.app.backend.controllers;

import com.app.backend.models.NguoiDung;
import com.app.backend.services.TaiKhoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tai-khoan")
public class TaiKhoanController {
    private TaiKhoanService taiKhoanService;

    @CrossOrigin(origins = "http://localhost:3000") // Allow requests from 'http://localhost:3000'
    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNguoiDung(@Validated @RequestBody NguoiDung nguoiDung){
        ResponseEntity<?> response = taiKhoanService.dangKyNguoiDung(nguoiDung);
        return response;
    }

}
