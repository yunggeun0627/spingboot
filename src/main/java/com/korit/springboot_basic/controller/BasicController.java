package com.korit.springboot_basic.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BasicController {

    // MediaType.TEXT_HTML.TEXT_HTML_VALUE
    // "text/html"

    @GetMapping(value = "/index", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String index() {
        List<String> names = List.of("예영근", "예영김", "예영이");
        return """
                <html>
                <head></head>
                <body>
                <h1>제목</h1>
                """
                +
                names.stream()
                        .map(name -> "<div>" + name + "</div>")
                        .collect(Collectors.joining())
                +
                """
                <body>
                </html>
                """;
    }

    @GetMapping("/index2")
    public String index2(Model model) {
        List<String> names = List.of("예영근", "예영김", "예영이");
        model.addAttribute("names", names);
        return "index";
    }
}
