package com.example.euagg.moneybowexercise.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Valuation {

    @SerializedName("FundGroupName")
    @Expose
    private String fundGroupName;
    @SerializedName("FundName")
    @Expose
    private String fundName;
    @SerializedName("FundSedol")
    @Expose
    private String fundSedol;
    @SerializedName("UnitPrice")
    @Expose
    private Integer unitPrice;
    @SerializedName("Units")
    @Expose
    private Integer units;
    @SerializedName("ValuationDate")
    @Expose
    private String valuationDate;
    @SerializedName("FundValue")
    @Expose
    private Integer fundValue;
    @SerializedName("Kid")
    @Expose
    private String kid;
    @SerializedName("FundId")
    @Expose
    private Integer fundId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Valuation() {
    }

    /**
     *
     * @param valuationDate
     * @param fundGroupName
     * @param fundSedol
     * @param fundId
     * @param fundName
     * @param unitPrice
     * @param fundValue
     * @param units
     * @param kid
     */
    public Valuation(String fundGroupName, String fundName, String fundSedol, Integer unitPrice, Integer units, String valuationDate, Integer fundValue, String kid, Integer fundId) {
        super();
        this.fundGroupName = fundGroupName;
        this.fundName = fundName;
        this.fundSedol = fundSedol;
        this.unitPrice = unitPrice;
        this.units = units;
        this.valuationDate = valuationDate;
        this.fundValue = fundValue;
        this.kid = kid;
        this.fundId = fundId;
    }

    public String getFundGroupName() {
        return fundGroupName;
    }

    public void setFundGroupName(String fundGroupName) {
        this.fundGroupName = fundGroupName;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundSedol() {
        return fundSedol;
    }

    public void setFundSedol(String fundSedol) {
        this.fundSedol = fundSedol;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public String getValuationDate() {
        return valuationDate;
    }

    public void setValuationDate(String valuationDate) {
        this.valuationDate = valuationDate;
    }

    public Integer getFundValue() {
        return fundValue;
    }

    public void setFundValue(Integer fundValue) {
        this.fundValue = fundValue;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

}