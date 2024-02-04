package uz.pdp.service;

import uz.pdp.entity.Bottle;
import uz.pdp.utils.Input;

public class GenerateBottle {
    public static Bottle bottle = new Bottle(0);
    public static void addWater(){
        int x = Input.INT("AmountWater : ");
        int amount = x + bottle.getAmount();
        if(amount > bottle.getSize()){
            System.out.println("Bottle is Full !!!");
        }else{
            System.out.println("Success addWater !!!");
            bottle.setAmount(amount);
        }
    }
    public static void pourWater(){
        int x = Input.INT("amountWater : ");
        if(bottle.getAmount()<x){
            System.out.println("Try again.");
            return;
        }
        bottle.setAmount(bottle.getAmount()-x);
        System.out.println("Success!.");
    }
}
