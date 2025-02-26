/*
 * @fileoverview    {AppTester}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * TODO: Description of {@code AppTester}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class AppTester {

    /**
     * Ejecuta las pruebas de la aplicación.
     *
     * @param args argumentos de la linea de comandos.
     * @return {@code true} si se ejecutan las pruebas correctamente, {@code false} caso contrario.
     */
    public static boolean startTesting(String[] args) {
        GenericFunctionalOperator op = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println("Ref Interface created with Lamba: " + op.calcular(3, 4));

        BiFunction<Double, Double, Double> refObject = op::calcular;
        System.out.println("Ref object method: " + refObject.apply(3d, 4d));

        Function<String, Integer> myFunct = AppTester::multiply;
        System.out.println("Ref static method: " + myFunct.apply("word"));

        Map<String, Function<String, Integer>> myFuntMap = new HashMap<>();
        myFuntMap.put("*", myFunct);
        myFuntMap.put("+", AppTester::sum);
        myFuntMap.put("-", new Function<String, Integer>() {
            @Override
            public Integer apply(String word) {
                return word.length() - 10;
            }
        });
        myFuntMap.put("/", (String word) -> word.length() / 2);
        myFuntMap.put("Integer", Integer::new);

        System.out.println("Map Ref static method: " + myFuntMap.get("*").apply("1234567890"));
        System.out.println("Map Ref static method: " + myFuntMap.get("+").apply("1234567890"));
        System.out.println("Map Ref new function method: " + myFuntMap.get("-").apply("1234567890"));
        System.out.println("Map Ref new function lambda method: " + myFuntMap.get("/").apply("1234567890"));
        System.out.println("Map Ref constructor: " + myFuntMap.get("Integer").apply("120"));

        BiFunction<String, String, Integer> myByFunct = AppTester::concat;
        System.out.println("Ref BiFuntion static method: " + myByFunct.apply("123", "123"));

        return true;
    }

    /**
     * TODO: Description of method {@code concat}.
     *
     * @param word1
     * @param word2
     * @return
     */
    public static int concat(String word1, String word2) {
        //return 10 * (word1.concat(word2)).length();
        return 10 * (new StringBuilder().append(word1).append(word2).toString()).length();
    }

    /**
     * TODO: Description of method {@code multiply}.
     *
     * @param word
     * @return
     */
    public static int multiply(String word) {
        return 10 * word.length();
    }

    /**
     * TODO: Description of method {@code sum}.
     *
     * @param word
     * @return 
     */
    public static int sum(String word) {
        return 10 + word.length();
    }
}
