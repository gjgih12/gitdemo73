package com.jk.model;

public class Car {

    private Integer carId;
    private String carName;
    private String carInfo;
    private Integer carPrices;

    public Integer getCarPrices() {
        return carPrices;
    }

    public void setCarPrices(Integer carPrices) {
        this.carPrices = carPrices;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
