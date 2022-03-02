package by.mahanko.array.util.impl;

import by.mahanko.array.util.CustomArrayIdGenerator;

import java.util.UUID;

public class CustomArrayIdGeneratorImpl implements CustomArrayIdGenerator {
    private static CustomArrayIdGeneratorImpl instance;

    private CustomArrayIdGeneratorImpl() {
    }

    public static CustomArrayIdGeneratorImpl getInstance() {
        if (instance == null) {
            instance = new CustomArrayIdGeneratorImpl();
        }

        return instance;
    }

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
