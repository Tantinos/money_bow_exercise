package com.example.euagg.moneybowexercise.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product_ {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("AnnualLimit")
    @Expose
    private Integer annualLimit;
    @SerializedName("DepositLimit")
    @Expose
    private Integer depositLimit;
    @SerializedName("FriendlyName")
    @Expose
    private String friendlyName;
    @SerializedName("CanWithdraw")
    @Expose
    private Boolean canWithdraw;
    @SerializedName("EndOfTaxYear")
    @Expose
    private String endOfTaxYear;
    @SerializedName("IsBonusDue")
    @Expose
    private Boolean isBonusDue;

    /**
     * No args constructor for use in serialization
     *
     */
    public Product_() {
    }

    /**
     *
     * @param endOfTaxYear
     * @param isBonusDue
     * @param name
     * @param friendlyName
     * @param annualLimit
     * @param depositLimit
     * @param canWithdraw
     * @param type
     */
    public Product_(String name, String type, Integer annualLimit, Integer depositLimit, String friendlyName, Boolean canWithdraw, String endOfTaxYear, Boolean isBonusDue) {
        super();
        this.name = name;
        this.type = type;
        this.annualLimit = annualLimit;
        this.depositLimit = depositLimit;
        this.friendlyName = friendlyName;
        this.canWithdraw = canWithdraw;
        this.endOfTaxYear = endOfTaxYear;
        this.isBonusDue = isBonusDue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAnnualLimit() {
        return annualLimit;
    }

    public void setAnnualLimit(Integer annualLimit) {
        this.annualLimit = annualLimit;
    }

    public Integer getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(Integer depositLimit) {
        this.depositLimit = depositLimit;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public String getEndOfTaxYear() {
        return endOfTaxYear;
    }

    public void setEndOfTaxYear(String endOfTaxYear) {
        this.endOfTaxYear = endOfTaxYear;
    }

    public Boolean getIsBonusDue() {
        return isBonusDue;
    }

    public void setIsBonusDue(Boolean isBonusDue) {
        this.isBonusDue = isBonusDue;
    }

}