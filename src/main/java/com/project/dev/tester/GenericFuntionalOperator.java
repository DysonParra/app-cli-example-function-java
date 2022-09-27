/*
 * @fileoverview {GenericFuntionalOperator}, se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @history v1.0 --- La implementacion de {GenericFuntionalOperator} fue realizada el 14/08/2022.
 * @dev - La primera version de {GenericFuntionalOperator} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.tester;

/**
 * TODO: Definición de {@code GenericFuntionalOperator}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@FunctionalInterface
public interface GenericFuntionalOperator {

    /**
     * TODO: Definición de {@code calcular}.
     *
     * @param n1
     * @param n2
     * @return
     */
    public double calcular(double n1, double n2);
}
