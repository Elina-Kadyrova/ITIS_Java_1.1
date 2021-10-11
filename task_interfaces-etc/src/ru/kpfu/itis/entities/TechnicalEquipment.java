package ru.kpfu.itis.entities;

import java.util.Date;
import java.util.Objects;

public abstract class TechnicalEquipment {
    protected String modelName;
    protected Date startOfOperation;
    protected String producer;
    protected int guaranteePeriod;

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void toFix();

    public TechnicalEquipment(String modelName, Date startOfOperation, String producer, int guaranteePeriod) {
        this.modelName = modelName;
        this.startOfOperation = startOfOperation;
        this.producer = producer;
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicalEquipment technicalEquipment = (TechnicalEquipment) o;
        return this.modelName.equals(technicalEquipment.modelName) &&
                this.producer.equals(technicalEquipment.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, startOfOperation, producer, guaranteePeriod);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Date getStartOfOperation() {
        return startOfOperation;
    }

    public void setStartOfOperation(Date startOfOperation) {
        this.startOfOperation = startOfOperation;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
