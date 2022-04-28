package com.company.MicaelaPerez;

import org.apache.log4j.Logger;

import java.util.List;

public class AverageCalculator {

    public static final Logger logger = Logger.getLogger(AppCalculator.class);
    public String average(List<Integer> integers){
        Integer accum = 0;

        for (Integer integer : integers){
            accum = accum + integer;
        }

        Integer average = accum/ integers.size();

        logger.info("The average is " + average);

        String msj = "The average is "+ average;
        return msj;
    }
}
