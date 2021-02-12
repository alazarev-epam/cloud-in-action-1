package com.alazarevepam.cloudinaction1.dto;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

@Data
public class Dummy {
    private String name;
    private int count;

    public static Dummy random() {
        Dummy dummy = new Dummy();
        dummy.setName(RandomStringUtils.randomAlphanumeric(10));
        dummy.setCount(new Random().nextInt());
        return dummy;
    }
}
