package uz.pdp.service;

import uz.pdp.entity.Bottle;
import uz.pdp.utils.Input;

public class GenerateBottle {
    static Bottle bottle = new Bottle(0);
    public static void addWater(){
        int x = Input.INT("amountWater : ");
        int amount = x + bottle.getAmount();
        if(amount > bottle.getSize()){
            System.out.println("bottle is Ful !!!");
        }else{
            bottle.setAmount(amount);
        }
    }
    public static void pourWater(){

    }
}