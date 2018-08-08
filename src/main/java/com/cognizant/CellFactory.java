package com.cognizant;

public class CellFactory {

    public static final String GOAL_STRING = "Hello World";
    private ValueGenerator valueGenerator;
    private FitnessGenerator fitnessGenerator;

    public Object create() {
        String value = valueGenerator.generate();
        return new Cell(value, fitnessGenerator.generate(GOAL_STRING, value));
    }

    public void setFitnessGenerator(FitnessGenerator generator) {
        this.fitnessGenerator = generator;
    }

    public void setValueGenerator(ValueGenerator valueGenerator) {
        this.valueGenerator = valueGenerator;
    }
}
