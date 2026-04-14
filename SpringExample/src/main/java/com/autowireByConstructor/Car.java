package com.autowireByConstructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void getDetails(){
        System.out.println("Specification :" + specification.toString());
    }
}
