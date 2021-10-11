package ru.kpfu.itis.entities;

import java.util.Date;

public class OrgTechnique extends OfficeEquipment {

    public OrgTechnique(String modelName, Date startOfOperation, String producer, int guaranteePeriod, int price,
                        int barcode) {
        super(modelName, startOfOperation, producer, guaranteePeriod, price, barcode);
    }

    @Override
    public void turnOn() {
        //press the button to turn on
    }

    @Override
    public void turnOff() {
        //press the button to turn off
    }

    @Override
    public void toFix(){
        //hand over org technique for repair
    }
}
