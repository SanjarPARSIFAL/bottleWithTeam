package uz.pdp.service;

import uz.pdp.entity.Bottle;
import uz.pdp.utils.Input;

public class GenerateBottle {
    public static Bottle bottle = new Bottle(0);
    public static void addWater(){

    }
    public static void pourWater(){
        int x = Input.INT("Qancha suv to'kmoqchisiz:");
        if(bottle.getAmount()<x){
            System.out.println("Buncha suv mavjud emas.");
            return;
        }
        bottle.setAmount(bottle.getAmount()-x);
        System.out.println("Bajarildi.");
    }
}
