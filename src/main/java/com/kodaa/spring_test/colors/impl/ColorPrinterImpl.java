package com.kodaa.spring_test.colors.impl;

import com.kodaa.spring_test.colors.interfaces.BluePrinter;
import com.kodaa.spring_test.colors.interfaces.ColorPrinter;
import com.kodaa.spring_test.colors.interfaces.GreenPrinter;
import com.kodaa.spring_test.colors.interfaces.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {

    private final RedPrinter redPrinter;
    private final GreenPrinter greenPrinter;
    private final BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
