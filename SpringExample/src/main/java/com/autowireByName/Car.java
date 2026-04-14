package com.autowireByName;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void getDetails(){
        System.out.println("Specification :" + specification.toString());
    }
}
