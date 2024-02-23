package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class BestCarSelector implements CarComparator {
    private CarDatabase carDatabase;

    public BestCarSelector(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }

    @Override
    public Car getBestCar() {
        List<Car> cars = carDatabase.getAllCars();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }}
