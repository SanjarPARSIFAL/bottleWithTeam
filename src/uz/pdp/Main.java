package uz.pdp;

import uz.pdp.service.GenerateBottle;
import uz.pdp.utils.Input;

public class Main {
    public static void main(String[] args) {
        stop:
        while (true){
            System.out.println("""
                    
                    1 - add water
                    2 - pour water
                    
                    0 - exit
                    
                    """);
            System.out.println(GenerateBottle.bottle);
            switch (Input.INT("command")){
                case 1 -> {
                    GenerateBottle.addWater();
                }
                case 2 -> {
                    GenerateBottle.pourWater();
                }
                case 0 -> {
                    break stop;
                }
            }
        }
    }
}
