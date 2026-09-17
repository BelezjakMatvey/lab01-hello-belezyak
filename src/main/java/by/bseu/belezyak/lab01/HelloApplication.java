package by.bseu.belezyak.lab01;

import org.apache.commons.lang3.StringUtils;

public class HelloApplication {
    public static void main(String[] args) {
        String studentName = "Matvey";
        String greeting = "hello, " + studentName + "!";

        System.out.println(StringUtils.capitalize(greeting));
        System.out.println("My first Maven project works!");
    }
}
