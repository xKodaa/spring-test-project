package com.kodaa.spring_test.colors;

import com.kodaa.spring_test.colors.interfaces.ColorPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColorsApp implements CommandLineRunner {

    private final ColorPrinter colorPrinter;

    public ColorsApp(ColorPrinter colorPrinter) {
        this.colorPrinter = colorPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorsApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(colorPrinter.print());
    }
}
