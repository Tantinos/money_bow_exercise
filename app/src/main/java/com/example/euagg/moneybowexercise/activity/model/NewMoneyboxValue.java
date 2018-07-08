package com.example.euagg.moneybowexercise.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewMoneyboxValue {

    @SerializedName("Moneybox")
    @Expose
    private Integer moneybox;

    /**
     * No args constructor for use in serialization
     *
     */
    public NewMoneyboxValue() {
    }

    /**
     *
     * @param moneybox
     */
    public NewMoneyboxValue(Integer moneybox) {
        super();
        this.moneybox = moneybox;
    }

    public Integer getMoneybox() {
        return moneybox;
    }

    public void setMoneybox(Integer moneybox) {
        this.moneybox = moneybox;
    }

}