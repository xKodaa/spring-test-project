package com.kodaa.spring_test.colors.config;

import com.kodaa.spring_test.colors.impl.*;
import com.kodaa.spring_test.colors.interfaces.BluePrinter;
import com.kodaa.spring_test.colors.interfaces.ColorPrinter;
import com.kodaa.spring_test.colors.interfaces.GreenPrinter;
import com.kodaa.spring_test.colors.interfaces.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
}
