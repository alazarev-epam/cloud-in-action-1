package com.alazarevepam.cloudinaction1.controller;

import com.alazarevepam.cloudinaction1.dto.Dummy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RequestMapping("/dummy")
@RestController
public class DummyApiController {

    @GetMapping
    public List<Dummy> listDummies() {
        return IntStream.range(0, 10).mapToObj(i->Dummy.random()).collect(Collectors.toList());
    }

    @GetMapping("/first")
    public Dummy first() {
        return Dummy.random();
    }

    @PostMapping
    public Dummy create(Dummy dummy) {
        dummy.setCount(dummy.getCount()+1);
        return dummy;
    }
}
