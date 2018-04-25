package org.bootcamp;

import org.bootcamp.service.InsuranceCalculationResult;
import org.bootcamp.service.InsuranceCalculatorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import sun.applet.Main;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class,args);
    }


    /*@Override
    public void run(String... args) {
        System.out.println(Thread.currentThread().getName());
        final List<InsuranceCalculationResult> resultList1 = service.calculateAll();
        final List<InsuranceCalculationResult> resultList2 = service.getCostsHigherThan(1000);

        resultList1.forEach(MainApp::printCalculationResult);

        System.out.println();

        resultList2.forEach(MainApp::printCalculationResult);

        System.out.println();

        printCalculationResult(service.calculateById("3c997def-3cff-11e8-c243-14de190f32bc"));

    }*/

    /*private static void printCalculationResult(InsuranceCalculationResult result) {

        if (result != null) {
            final String output = String.format(OUTPUT_FORMAT, result.getVehicleTypeName(), result.getId(), result.getCost());
            System.out.println(output);
        }
    }*/
}
