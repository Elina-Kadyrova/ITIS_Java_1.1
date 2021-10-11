package ru.kpfu.itis.entities;

import java.util.Date;
import java.util.Objects;

public class Scanner extends OrgTechnique implements Scanning {
    protected final boolean typeOfScanner; //false - flatbed scanner, true - handheld scanner

    public Scanner(String modelName, Date startOfOperation, String producer, int guaranteePeriod, int price, int barcode,
                   boolean typeOfScanner) {
        super(modelName, startOfOperation, producer, guaranteePeriod, price, barcode);
        this.typeOfScanner = typeOfScanner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scanner scanner = (Scanner) o;
        return this.modelName.equals(scanner.modelName) &&
                this.producer.equals(scanner.producer) &&
                this.barcode == scanner.barcode &&
                this.typeOfScanner == (scanner.typeOfScanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, startOfOperation, producer, guaranteePeriod, price, barcode, typeOfScanner);
    }

    @Override
    public void toScan() {
        //scanning of text or picture
    }

    public boolean isTypeOfScanner() {
        return typeOfScanner;
    }
}
