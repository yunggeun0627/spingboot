package com.korit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

// 요청 URL: /api/age 응답 데이터: {name: 예영근, age: 21} map
// 요청 URL: /api/names 응답 데이터: {"000", "111", "222"}
// 요청 URL: /api/students 응답 데이터: [{name: 예영근, age: 21}, {name: 000, age: 22}]
/*
    [
        {
            name: 예영근,
            age: 21,
            hobby: [축구, 농구]
        },
        {
            name: 예일근,0
            age: 22,
            hobby: [골프, 낚시]
        }
    ]
 */

@RestController
@RequestMapping("/api")
public class HttpStudyController2 {

    @GetMapping("/age")
    public Map<String, Object> getAge() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "예영근");
        map.put("age", 21);
        return map;
//      Map<String, Object> map2 = Map.of("name", "예영근", "age", 21);       불변맵으로 추가,삭제를 못한다
    }

    @GetMapping("/names")
    public List<String> getNames() {
        List<String> list = new ArrayList<>();
        list.add("예영근");
        list.add("예일근");
        list.add("예이근");
        return list;
//      return List.of("예영근", "예일근", "예이근");
    }

    @GetMapping("/names2")
    public String[] getnames2() {
        String[] names2 = {"예영근", "예일근", "예이근"};
//        int a = 10;
//        Object obj = new String[]{"예영근", "예일근", "예이근"};
        return names2;
    }

    @GetMapping("/students")
    public List<Map<String, Object>> getStudent() {
        List<Map<String, Object>> List = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "예영근");
        map.put("age", 21);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "예일근");
        map2.put("age", 22);
        List.add(map);
        List.add(map2);
//        List<Map<String, Object>> list = List.of(map, map2);

        return List;
//        return List.of(
//                Map.of("name", "예영근", "age", 21),
//                Map.of("name", "예일근", "age", 22)
//        );
    }

    @GetMapping("/students2")
    public List<Map<String, Object>> getStudents2() {
        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "예영근");
        map.put("age", 21);
        map.put("hobby", Arrays.asList("축구, 농구"));
        mapList.add(map);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "예일근");
        map2.put("age", 22);
        map2.put("hobby", Arrays.asList("골프, 낚시"));
        mapList.add(map2);

        return mapList;
    }
}
