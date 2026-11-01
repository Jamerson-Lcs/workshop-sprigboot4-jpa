package com.educandoweb.courseSpring.entitites.enums;

public enum OrderStatus {

    DELIVERED(1),
    CANCELED(2),
    WAITING_PAYMENT(3),
    PAID(4),
    SHIPPED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;

    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
