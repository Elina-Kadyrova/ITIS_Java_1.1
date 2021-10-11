package ru.kpfu.itis.entities;

import java.util.Date;
import java.util.Objects;

public class Printer extends OrgTechnique implements Printing {
    protected final boolean typeOfPrinter; //false - laser printer, true - inkjet printer
    protected boolean printColor; //false - mono, true - in color

    public Printer(String modelName, Date startOfOperation, String producer, int guaranteePeriod, int price, int barcode,
                    boolean typeOfPrinter, boolean printColor) {
        super(modelName, startOfOperation, producer, guaranteePeriod, price, barcode);
        this.typeOfPrinter = typeOfPrinter;
        this.printColor = printColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return this.modelName.equals(printer.modelName) &&
                this.producer.equals(printer.producer) &&
                this.barcode == printer.barcode &&
                this.typeOfPrinter == (printer.typeOfPrinter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, startOfOperation, producer, guaranteePeriod, price, barcode,
                typeOfPrinter, printColor);
    }

    @Override
    public void toPrint(){
        System.out.println("some text or picture here");
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
}
