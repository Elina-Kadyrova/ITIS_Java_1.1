package ru.kpfu.itis.entities;

import java.util.Date;
import java.util.Objects;

public class MultifunctionDevice extends OrgTechnique implements AllInOne{
    protected final boolean typeOfPrinter; //false - laser printer, true - inkjet printer
    protected boolean printColor; //false - mono, true - in color
    protected final boolean typeOfScanner; //false - flatbed scanner, true - handheld scanner

    public MultifunctionDevice(String modelName, Date startOfOperation, String producer, int guaranteePeriod, int price,
                               int barcode, boolean typeOfPrinter, boolean printColor, boolean typeOfScanner) {
        super(modelName, startOfOperation, producer, guaranteePeriod, price, barcode);
        this.typeOfPrinter = typeOfPrinter;
        this.printColor = printColor;
        this.typeOfScanner = typeOfScanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultifunctionDevice multifunctionDevice = (MultifunctionDevice) o;
        return this.modelName.equals(multifunctionDevice.modelName) &&
                this.producer.equals(multifunctionDevice.producer) &&
                this.barcode == multifunctionDevice.barcode &&
                this.typeOfPrinter == (multifunctionDevice.typeOfPrinter) &&
                this.typeOfScanner == (multifunctionDevice.typeOfScanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, startOfOperation, producer, guaranteePeriod, price, barcode,
                typeOfPrinter, printColor, typeOfScanner);
    }

    @Override
    public void toPrint() {
        System.out.println("some text or picture here");
    }

    @Override
    public void toScan() {
        //scanning of text or picture
    }

    public boolean isTypeOfPrinter() {
        return typeOfPrinter;
    }

    public boolean isPrintColor() {
        return printColor;
    }

    public void setPrintColor(boolean printColor) {
        this.printColor = printColor;
    }

    public boolean isTypeOfScanner() {
        return typeOfScanner;
    }
}
