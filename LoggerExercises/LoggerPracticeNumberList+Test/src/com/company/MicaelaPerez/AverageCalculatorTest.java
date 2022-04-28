package com.company.MicaelaPerez;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AverageCalculatorTest {
    @Test
    public void deberiaChequearQueElPromedioEsCorrecto(){
        //ARRANGE
        AverageCalculator avTest = new AverageCalculator();
        List<Integer>integerListTest = new ArrayList<>();
        integerListTest.add(15);
        integerListTest.add(36);
        integerListTest.add(87);

        //ACT
        String expectedResult = avTest.average(integerListTest);

        //ASSERT
        Assert.assertEquals(expectedResult, "The average is 46");

    }

}