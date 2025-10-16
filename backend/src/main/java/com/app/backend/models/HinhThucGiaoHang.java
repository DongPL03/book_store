package com.app.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Data
@Table(name = "hinh_thuc_giao_hang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HinhThucGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_giao_hang")
    private int maHinhThucGiaoHang;
    @Column(name = "ten_hinh_thuc_giao_hang")
    private String tenHinhThucGiaoHang;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoHang;

    @OneToMany(mappedBy = "hinhThucGiaoHang",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<DonHang> danhSachDonHang;
}
