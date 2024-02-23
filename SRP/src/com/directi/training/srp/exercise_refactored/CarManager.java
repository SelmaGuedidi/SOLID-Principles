package com.directi.training.srp.exercise_refactored;


public class CarManager {
    private CarInfoProvider carInfoProvider;
    private CarComparator carSelector;

    public CarManager(CarInfoProvider carInfoProvider, CarComparator carSelector) {
        this.carInfoProvider = carInfoProvider;
        this.carSelector = carSelector;
    }

    public String getCarsNames() {
        return carInfoProvider.getCarsNames();
    }
  

    public Car getBestCar() {
        return carSelector.getBestCar();
    }
}
