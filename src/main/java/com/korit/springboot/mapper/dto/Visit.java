package com.korit.springboot.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
    Mybatis를 사용해서 데이터를 관리 할 때 사용될 Entity객체
    모든 Mapper의 DTO는 DB의 데이블 구조와 동일하게 작성한다.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Visit {
    private Integer visitId;
    private Integer patientId;
    private Integer doctorId;
    private Integer treatmentId;
    private LocalDateTime visitDate;
    private Integer fee;
}
