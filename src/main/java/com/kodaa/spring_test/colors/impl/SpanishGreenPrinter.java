package com.kodaa.spring_test.colors.impl;

import com.kodaa.spring_test.colors.interfaces.GreenPrinter;

public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green (spanish)";
    }
}
