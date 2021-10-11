package ru.kpfu.itis.entities;

import java.util.Date;
import java.util.Objects;

public abstract class OfficeEquipment extends TechnicalEquipment {
    protected int price;
    protected int barcode;

    public OfficeEquipment(String modelName, Date startOfOperation, String producer, int guaranteePeriod, int price,
                           int barcode) {
        super(modelName, startOfOperation, producer, guaranteePeriod);
        this.price = price;
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeEquipment officeEquipment = (OfficeEquipment) o;
        return this.modelName.equals(officeEquipment.modelName) &&
                this.producer.equals(officeEquipment.producer) &&
                this.barcode == officeEquipment.barcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, startOfOperation, producer, guaranteePeriod, price, barcode);
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
