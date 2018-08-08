package com.cognizant;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CellFactoryTest {

    private static final String EXPECTED_VALUE = "mumble";
    private static final int EXPECTED_FITNESS = 10;
    private FitnessGenerator mockFitnessGenerator = mock(FitnessGenerator.class);
    private ValueGenerator mockValueGenerator = mock(ValueGenerator.class);

    private CellFactory cellFactory = new CellFactory();

    @Test
    public void testCreate() throws Exception {
        when(mockValueGenerator.generate()).thenReturn(EXPECTED_VALUE);
        when(mockFitnessGenerator.generate(CellFactory.GOAL_STRING, EXPECTED_VALUE)).thenReturn(EXPECTED_FITNESS);
        cellFactory.setValueGenerator(mockValueGenerator);
        cellFactory.setFitnessGenerator(mockFitnessGenerator);
       assertEquals(createExpectedCell(), cellFactory.create());
    }

    private Cell createExpectedCell() {
        return new Cell(EXPECTED_VALUE, EXPECTED_FITNESS);
    }
}