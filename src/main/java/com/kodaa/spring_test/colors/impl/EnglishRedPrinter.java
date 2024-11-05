package com.kodaa.spring_test.colors.impl;

import com.kodaa.spring_test.colors.interfaces.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
