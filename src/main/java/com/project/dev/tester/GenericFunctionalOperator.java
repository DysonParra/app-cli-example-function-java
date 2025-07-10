/*
 * @overview        {GenericFunctionalOperator}
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

/**
 * TODO: Description of {@code GenericFunctionalOperator}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@FunctionalInterface
public interface GenericFunctionalOperator {

    /**
     * TODO: Description of method {@code calcular}.
     *
     * @param n1
     * @param n2
     * @return
     */
    public double calcular(double n1, double n2);
}
