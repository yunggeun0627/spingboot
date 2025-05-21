package com.korit.springboot.ioc;

import org.springframework.stereotype.Component;


public class 엘지배터리 implements 배터리 {
    @Override
    public void 전류공급() {
        System.out.println("엘지 배터리로 전류를 공급합니다.");
    }

    @Override
    public void 충전() {
        System.out.println("엘지 베터리 충전합니다.");
    }

}
