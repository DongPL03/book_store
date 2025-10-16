package com.app.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "sach_yeu_thich")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SachYeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach_yeu_thich")
    private int maSachYeuThich;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_nguoi_dung", nullable = false)
    private NguoiDung nguoiDung;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_sach", nullable = false)
    private Sach sach;

}

