package com.example.euagg.moneybowexercise.activity.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("InvestorProductId")
    @Expose
    private Integer investorProductId;
    @SerializedName("InvestorProductType")
    @Expose
    private String investorProductType;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductHexCode")
    @Expose
    private String productHexCode;
    @SerializedName("Moneybox")
    @Expose
    private Integer moneybox;
    @SerializedName("PreviousMoneybox")
    @Expose
    private Integer previousMoneybox;
    @SerializedName("SubscriptionAmount")
    @Expose
    private Integer subscriptionAmount;
    @SerializedName("PlanValue")
    @Expose
    private Integer planValue;
    @SerializedName("Sytd")
    @Expose
    private Integer sytd;
    @SerializedName("TransferInSytd")
    @Expose
    private Integer transferInSytd;
    @SerializedName("MaximumWithdrawal")
    @Expose
    private Integer maximumWithdrawal;
    @SerializedName("MaximumDeposit")
    @Expose
    private Integer maximumDeposit;
    @SerializedName("TotalContributions")
    @Expose
    private Integer totalContributions;
    @SerializedName("TotalReturnValue")
    @Expose
    private Integer totalReturnValue;
    @SerializedName("TotalReturnPercentage")
    @Expose
    private Integer totalReturnPercentage;
    @SerializedName("CashInTransit")
    @Expose
    private Integer cashInTransit;
    @SerializedName("ResidualCash")
    @Expose
    private Integer residualCash;
    @SerializedName("TotalFees")
    @Expose
    private Integer totalFees;
    @SerializedName("TotalReturnValueGross")
    @Expose
    private Integer totalReturnValueGross;
    @SerializedName("PendingWithdrawal")
    @Expose
    private Integer pendingWithdrawal;
    @SerializedName("IsPendingRebalance")
    @Expose
    private Boolean isPendingRebalance;
    @SerializedName("PendingDeposit")
    @Expose
    private Integer pendingDeposit;
    @SerializedName("PendingGovernmentBonus")
    @Expose
    private Integer pendingGovernmentBonus;
    @SerializedName("RemainingAllowance")
    @Expose
    private Integer remainingAllowance;
    @SerializedName("MaximumBonus")
    @Expose
    private Integer maximumBonus;
    @SerializedName("Product")
    @Expose
    private Product_ product;
    @SerializedName("DateModified")
    @Expose
    private String dateModified;
    @SerializedName("Valuations")
    @Expose
    private List<Valuation> valuations = null;
    @SerializedName("IsSelected")
    @Expose
    private Boolean isSelected;
    @SerializedName("IsFavourite")
    @Expose
    private Boolean isFavourite;
    @SerializedName("QuickAddAmount")
    @Expose
    private Integer quickAddAmount;
    @SerializedName("InternalTransferIn")
    @Expose
    private Integer internalTransferIn;
    @SerializedName("CurrentSavingsThisTaxYear")
    @Expose
    private Integer currentSavingsThisTaxYear;
    @SerializedName("InternalTransferInSytd")
    @Expose
    private Integer internalTransferInSytd;

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param maximumWithdrawal
     * @param transferInSytd
     * @param productHexCode
     * @param dateModified
     * @param isPendingRebalance
     * @param totalReturnValue
     * @param sytd
     * @param internalTransferIn
     * @param valuations
     * @param previousMoneybox
     * @param investorProductType
     * @param currentSavingsThisTaxYear
     * @param totalContributions
     * @param isFavourite
     * @param cashInTransit
     * @param pendingWithdrawal
     * @param remainingAllowance
     * @param moneybox
     * @param internalTransferInSytd
     * @param totalReturnValueGross
     * @param quickAddAmount
     * @param productId
     * @param totalReturnPercentage
     * @param product
     * @param residualCash
     * @param maximumDeposit
     * @param pendingGovernmentBonus
     * @param maximumBonus
     * @param totalFees
     * @param isSelected
     * @param investorProductId
     * @param pendingDeposit
     * @param subscriptionAmount
     * @param planValue
     */
    public Product(Integer investorProductId, String investorProductType, Integer productId, String productHexCode, Integer moneybox, Integer previousMoneybox, Integer subscriptionAmount, Integer planValue, Integer sytd, Integer transferInSytd, Integer maximumWithdrawal, Integer maximumDeposit, Integer totalContributions, Integer totalReturnValue, Integer totalReturnPercentage, Integer cashInTransit, Integer residualCash, Integer totalFees, Integer totalReturnValueGross, Integer pendingWithdrawal, Boolean isPendingRebalance, Integer pendingDeposit, Integer pendingGovernmentBonus, Integer remainingAllowance, Integer maximumBonus, Product_ product, String dateModified, List<Valuation> valuations, Boolean isSelected, Boolean isFavourite, Integer quickAddAmount, Integer internalTransferIn, Integer currentSavingsThisTaxYear, Integer internalTransferInSytd) {
        super();
        this.investorProductId = investorProductId;
        this.investorProductType = investorProductType;
        this.productId = productId;
        this.productHexCode = productHexCode;
        this.moneybox = moneybox;
        this.previousMoneybox = previousMoneybox;
        this.subscriptionAmount = subscriptionAmount;
        this.planValue = planValue;
        this.sytd = sytd;
        this.transferInSytd = transferInSytd;
        this.maximumWithdrawal = maximumWithdrawal;
        this.maximumDeposit = maximumDeposit;
        this.totalContributions = totalContributions;
        this.totalReturnValue = totalReturnValue;
        this.totalReturnPercentage = totalReturnPercentage;
        this.cashInTransit = cashInTransit;
        this.residualCash = residualCash;
        this.totalFees = totalFees;
        this.totalReturnValueGross = totalReturnValueGross;
        this.pendingWithdrawal = pendingWithdrawal;
        this.isPendingRebalance = isPendingRebalance;
        this.pendingDeposit = pendingDeposit;
        this.pendingGovernmentBonus = pendingGovernmentBonus;
        this.remainingAllowance = remainingAllowance;
        this.maximumBonus = maximumBonus;
        this.product = product;
        this.dateModified = dateModified;
        this.valuations = valuations;
        this.isSelected = isSelected;
        this.isFavourite = isFavourite;
        this.quickAddAmount = quickAddAmount;
        this.internalTransferIn = internalTransferIn;
        this.currentSavingsThisTaxYear = currentSavingsThisTaxYear;
        this.internalTransferInSytd = internalTransferInSytd;
    }

    public Integer getInvestorProductId() {
        return investorProductId;
    }

    public void setInvestorProductId(Integer investorProductId) {
        this.investorProductId = investorProductId;
    }

    public String getInvestorProductType() {
        return investorProductType;
    }

    public void setInvestorProductType(String investorProductType) {
        this.investorProductType = investorProductType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductHexCode() {
        return productHexCode;
    }

    public void setProductHexCode(String productHexCode) {
        this.productHexCode = productHexCode;
    }

    public Integer getMoneybox() {
        return moneybox;
    }

    public void setMoneybox(Integer moneybox) {
        this.moneybox = moneybox;
    }

    public Integer getPreviousMoneybox() {
        return previousMoneybox;
    }

    public void setPreviousMoneybox(Integer previousMoneybox) {
        this.previousMoneybox = previousMoneybox;
    }

    public Integer getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(Integer subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }

    public Integer getPlanValue() {
        return planValue;
    }

    public void setPlanValue(Integer planValue) {
        this.planValue = planValue;
    }

    public Integer getSytd() {
        return sytd;
    }

    public void setSytd(Integer sytd) {
        this.sytd = sytd;
    }

    public Integer getTransferInSytd() {
        return transferInSytd;
    }

    public void setTransferInSytd(Integer transferInSytd) {
        this.transferInSytd = transferInSytd;
    }

    public Integer getMaximumWithdrawal() {
        return maximumWithdrawal;
    }

    public void setMaximumWithdrawal(Integer maximumWithdrawal) {
        this.maximumWithdrawal = maximumWithdrawal;
    }

    public Integer getMaximumDeposit() {
        return maximumDeposit;
    }

    public void setMaximumDeposit(Integer maximumDeposit) {
        this.maximumDeposit = maximumDeposit;
    }

    public Integer getTotalContributions() {
        return totalContributions;
    }

    public void setTotalContributions(Integer totalContributions) {
        this.totalContributions = totalContributions;
    }

    public Integer getTotalReturnValue() {
        return totalReturnValue;
    }

    public void setTotalReturnValue(Integer totalReturnValue) {
        this.totalReturnValue = totalReturnValue;
    }

    public Integer getTotalReturnPercentage() {
        return totalReturnPercentage;
    }

    public void setTotalReturnPercentage(Integer totalReturnPercentage) {
        this.totalReturnPercentage = totalReturnPercentage;
    }

    public Integer getCashInTransit() {
        return cashInTransit;
    }

    public void setCashInTransit(Integer cashInTransit) {
        this.cashInTransit = cashInTransit;
    }

    public Integer getResidualCash() {
        return residualCash;
    }

    public void setResidualCash(Integer residualCash) {
        this.residualCash = residualCash;
    }

    public Integer getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(Integer totalFees) {
        this.totalFees = totalFees;
    }

    public Integer getTotalReturnValueGross() {
        return totalReturnValueGross;
    }

    public void setTotalReturnValueGross(Integer totalReturnValueGross) {
        this.totalReturnValueGross = totalReturnValueGross;
    }

    public Integer getPendingWithdrawal() {
        return pendingWithdrawal;
    }

    public void setPendingWithdrawal(Integer pendingWithdrawal) {
        this.pendingWithdrawal = pendingWithdrawal;
    }

    public Boolean getIsPendingRebalance() {
        return isPendingRebalance;
    }

    public void setIsPendingRebalance(Boolean isPendingRebalance) {
        this.isPendingRebalance = isPendingRebalance;
    }

    public Integer getPendingDeposit() {
        return pendingDeposit;
    }

    public void setPendingDeposit(Integer pendingDeposit) {
        this.pendingDeposit = pendingDeposit;
    }

    public Integer getPendingGovernmentBonus() {
        return pendingGovernmentBonus;
    }

    public void setPendingGovernmentBonus(Integer pendingGovernmentBonus) {
        this.pendingGovernmentBonus = pendingGovernmentBonus;
    }

    public Integer getRemainingAllowance() {
        return remainingAllowance;
    }

    public void setRemainingAllowance(Integer remainingAllowance) {
        this.remainingAllowance = remainingAllowance;
    }

    public Integer getMaximumBonus() {
        return maximumBonus;
    }

    public void setMaximumBonus(Integer maximumBonus) {
        this.maximumBonus = maximumBonus;
    }

    public Product_ getProduct() {
        return product;
    }

    public void setProduct(Product_ product) {
        this.product = product;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public List<Valuation> getValuations() {
        return valuations;
    }

    public void setValuations(List<Valuation> valuations) {
        this.valuations = valuations;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getIsFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(Boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

    public Integer getQuickAddAmount() {
        return quickAddAmount;
    }

    public void setQuickAddAmount(Integer quickAddAmount) {
        this.quickAddAmount = quickAddAmount;
    }

    public Integer getInternalTransferIn() {
        return internalTransferIn;
    }

    public void setInternalTransferIn(Integer internalTransferIn) {
        this.internalTransferIn = internalTransferIn;
    }

    public Integer getCurrentSavingsThisTaxYear() {
        return currentSavingsThisTaxYear;
    }

    public void setCurrentSavingsThisTaxYear(Integer currentSavingsThisTaxYear) {
        this.currentSavingsThisTaxYear = currentSavingsThisTaxYear;
    }

    public Integer getInternalTransferInSytd() {
        return internalTransferInSytd;
    }

    public void setInternalTransferInSytd(Integer internalTransferInSytd) {
        this.internalTransferInSytd = internalTransferInSytd;
    }

}