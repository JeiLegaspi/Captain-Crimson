package com.example.captaincrimson;

public class DifferentStages {
    public static void main(String[] args) {
        String firstInput = "1";
        switch(firstInput){
            case "1":
                new easyLevel();
                break;
            case "2":
                new normalLevel();
                break;
            case "3":
                new difficultLevel();
                break;
        }
    }
}
