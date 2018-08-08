package com.cognizant;

import java.util.Objects;

public class Cell {
    private String value;
    private int fitness;

    public Cell(String value, int fitness) {
        this.value = value;
        this.fitness = fitness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cell cell = (Cell) o;
        return fitness == cell.fitness &&
               Objects.equals(value, cell.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, fitness);
    }

    @Override
    public String toString() {
        return "Cell{" +
               "value='" + value + '\'' +
               ", fitness=" + fitness +
               '}';
    }
}
