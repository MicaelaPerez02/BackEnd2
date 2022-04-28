package com.company.MicaelaPerez;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AppCalculator {
    //Necesito una lista para almacenar los números
    private List<Integer> numberList;
    public static final Logger logger = Logger.getLogger(AppCalculator.class);

    public AppCalculator() {
        //Instancio la lista como una lista de arrays
        numberList = new ArrayList<>();
    }

    public void addNumber(Integer number){
        //Agrego los numeros en la lista
        numberList.add(number);
        //Comparo la cantidad de numeros que tiene para usar los logs
        if (numberList.size()>5){
            //Armamos el log pedido por consola
            logger.info("The list has more than 5 total elements. Total elements: " + numberList.size());
        }
        if (numberList.size()>10){
            logger.info("The list has more than 10 total elements. Total elements: " + numberList.size());
        }
        if (numberList.isEmpty()){
            logger.error("The list has no elements");
        }
    }

    public List<Integer> getNumberList() {
        return numberList;
    }
}
