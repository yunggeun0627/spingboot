package com.korit.springboot.domain.dto;

import com.korit.springboot.domain.entity.DoctorEntity;
import lombok.Data;

import javax.print.Doc;

@Data
public class DoctorRegisterDto {
    private String doctorName;
    private String departmentName;

    public DoctorEntity toEntity() {
        return DoctorEntity.builder()
                .doctorName(doctorName)
                .build();
    }
}


