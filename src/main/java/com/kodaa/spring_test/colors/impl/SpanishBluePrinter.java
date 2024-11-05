package com.kodaa.spring_test.colors.impl;

import com.kodaa.spring_test.colors.interfaces.BluePrinter;

public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue (spanish)";
    }
}
