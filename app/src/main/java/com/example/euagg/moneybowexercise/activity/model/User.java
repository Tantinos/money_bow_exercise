package com.example.euagg.moneybowexercise.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("HasVerifiedEmail")
    @Expose
    private Boolean hasVerifiedEmail;
    @SerializedName("IsPinSet")
    @Expose
    private Boolean isPinSet;
    @SerializedName("AmlStatus")
    @Expose
    private String amlStatus;
    @SerializedName("AmlAttempts")
    @Expose
    private Integer amlAttempts;
    @SerializedName("RoundUpMode")
    @Expose
    private String roundUpMode;
    @SerializedName("JisaRoundUpMode")
    @Expose
    private String jisaRoundUpMode;
    @SerializedName("InvestorProduct")
    @Expose
    private String investorProduct;
    @SerializedName("RegistrationStatus")
    @Expose
    private String registrationStatus;
    @SerializedName("JisaRegistrationStatus")
    @Expose
    private String jisaRegistrationStatus;
    @SerializedName("DirectDebitMandateStatus")
    @Expose
    private String directDebitMandateStatus;
    @SerializedName("DateCreated")
    @Expose
    private String dateCreated;
    @SerializedName("Animal")
    @Expose
    private String animal;
    @SerializedName("ReferralCode")
    @Expose
    private String referralCode;
    @SerializedName("IntercomHmac")
    @Expose
    private String intercomHmac;
    @SerializedName("IntercomHmaciOS")
    @Expose
    private String intercomHmaciOS;
    @SerializedName("IntercomHmacAndroid")
    @Expose
    private String intercomHmacAndroid;
    @SerializedName("HasCompletedTutorial")
    @Expose
    private Boolean hasCompletedTutorial;
    @SerializedName("LastPayment")
    @Expose
    private Integer lastPayment;
    @SerializedName("PreviousMoneyboxAmount")
    @Expose
    private Integer previousMoneyboxAmount;
    @SerializedName("MoneyboxRegistrationStatus")
    @Expose
    private String moneyboxRegistrationStatus;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("RoundUpWholePounds")
    @Expose
    private Boolean roundUpWholePounds;
    @SerializedName("DoubleRoundUps")
    @Expose
    private Boolean doubleRoundUps;
    @SerializedName("MoneyboxAmount")
    @Expose
    private Integer moneyboxAmount;
    @SerializedName("InvestmentTotal")
    @Expose
    private Integer investmentTotal;
    @SerializedName("CanReinstateMandate")
    @Expose
    private Boolean canReinstateMandate;
    @SerializedName("DirectDebitHasBeenSubmitted")
    @Expose
    private Boolean directDebitHasBeenSubmitted;
    @SerializedName("ApiVersion")
    @Expose
    private String apiVersion;
    @SerializedName("MonthlyBoostEnabled")
    @Expose
    private Boolean monthlyBoostEnabled;
    @SerializedName("MonthlyBoostAmount")
    @Expose
    private Integer monthlyBoostAmount;
    @SerializedName("MonthlyBoostDay")
    @Expose
    private Integer monthlyBoostDay;

    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param doubleRoundUps
     * @param lastPayment
     * @param registrationStatus
     * @param referralCode
     * @param canReinstateMandate
     * @param monthlyBoostDay
     * @param monthlyBoostAmount
     * @param directDebitHasBeenSubmitted
     * @param jisaRegistrationStatus
     * @param directDebitMandateStatus
     * @param intercomHmaciOS
     * @param hasVerifiedEmail
     * @param amlAttempts
     * @param userId
     * @param moneyboxAmount
     * @param amlStatus
     * @param firstName
     * @param intercomHmacAndroid
     * @param roundUpMode
     * @param animal
     * @param apiVersion
     * @param lastName
     * @param previousMoneyboxAmount
     * @param investorProduct
     * @param investmentTotal
     * @param monthlyBoostEnabled
     * @param isPinSet
     * @param moneyboxRegistrationStatus
     * @param email
     * @param dateCreated
     * @param intercomHmac
     * @param jisaRoundUpMode
     * @param roundUpWholePounds
     * @param hasCompletedTutorial
     */
    public User(String userId, Boolean hasVerifiedEmail, Boolean isPinSet, String amlStatus, Integer amlAttempts, String roundUpMode, String jisaRoundUpMode, String investorProduct, String registrationStatus, String jisaRegistrationStatus, String directDebitMandateStatus, String dateCreated, String animal, String referralCode, String intercomHmac, String intercomHmaciOS, String intercomHmacAndroid, Boolean hasCompletedTutorial, Integer lastPayment, Integer previousMoneyboxAmount, String moneyboxRegistrationStatus, String email, String firstName, String lastName, Boolean roundUpWholePounds, Boolean doubleRoundUps, Integer moneyboxAmount, Integer investmentTotal, Boolean canReinstateMandate, Boolean directDebitHasBeenSubmitted, String apiVersion, Boolean monthlyBoostEnabled, Integer monthlyBoostAmount, Integer monthlyBoostDay) {
        super();
        this.userId = userId;
        this.hasVerifiedEmail = hasVerifiedEmail;
        this.isPinSet = isPinSet;
        this.amlStatus = amlStatus;
        this.amlAttempts = amlAttempts;
        this.roundUpMode = roundUpMode;
        this.jisaRoundUpMode = jisaRoundUpMode;
        this.investorProduct = investorProduct;
        this.registrationStatus = registrationStatus;
        this.jisaRegistrationStatus = jisaRegistrationStatus;
        this.directDebitMandateStatus = directDebitMandateStatus;
        this.dateCreated = dateCreated;
        this.animal = animal;
        this.referralCode = referralCode;
        this.intercomHmac = intercomHmac;
        this.intercomHmaciOS = intercomHmaciOS;
        this.intercomHmacAndroid = intercomHmacAndroid;
        this.hasCompletedTutorial = hasCompletedTutorial;
        this.lastPayment = lastPayment;
        this.previousMoneyboxAmount = previousMoneyboxAmount;
        this.moneyboxRegistrationStatus = moneyboxRegistrationStatus;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roundUpWholePounds = roundUpWholePounds;
        this.doubleRoundUps = doubleRoundUps;
        this.moneyboxAmount = moneyboxAmount;
        this.investmentTotal = investmentTotal;
        this.canReinstateMandate = canReinstateMandate;
        this.directDebitHasBeenSubmitted = directDebitHasBeenSubmitted;
        this.apiVersion = apiVersion;
        this.monthlyBoostEnabled = monthlyBoostEnabled;
        this.monthlyBoostAmount = monthlyBoostAmount;
        this.monthlyBoostDay = monthlyBoostDay;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getHasVerifiedEmail() {
        return hasVerifiedEmail;
    }

    public void setHasVerifiedEmail(Boolean hasVerifiedEmail) {
        this.hasVerifiedEmail = hasVerifiedEmail;
    }

    public Boolean getIsPinSet() {
        return isPinSet;
    }

    public void setIsPinSet(Boolean isPinSet) {
        this.isPinSet = isPinSet;
    }

    public String getAmlStatus() {
        return amlStatus;
    }

    public void setAmlStatus(String amlStatus) {
        this.amlStatus = amlStatus;
    }

    public Integer getAmlAttempts() {
        return amlAttempts;
    }

    public void setAmlAttempts(Integer amlAttempts) {
        this.amlAttempts = amlAttempts;
    }

    public String getRoundUpMode() {
        return roundUpMode;
    }

    public void setRoundUpMode(String roundUpMode) {
        this.roundUpMode = roundUpMode;
    }

    public String getJisaRoundUpMode() {
        return jisaRoundUpMode;
    }

    public void setJisaRoundUpMode(String jisaRoundUpMode) {
        this.jisaRoundUpMode = jisaRoundUpMode;
    }

    public String getInvestorProduct() {
        return investorProduct;
    }

    public void setInvestorProduct(String investorProduct) {
        this.investorProduct = investorProduct;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getJisaRegistrationStatus() {
        return jisaRegistrationStatus;
    }

    public void setJisaRegistrationStatus(String jisaRegistrationStatus) {
        this.jisaRegistrationStatus = jisaRegistrationStatus;
    }

    public String getDirectDebitMandateStatus() {
        return directDebitMandateStatus;
    }

    public void setDirectDebitMandateStatus(String directDebitMandateStatus) {
        this.directDebitMandateStatus = directDebitMandateStatus;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getIntercomHmac() {
        return intercomHmac;
    }

    public void setIntercomHmac(String intercomHmac) {
        this.intercomHmac = intercomHmac;
    }

    public String getIntercomHmaciOS() {
        return intercomHmaciOS;
    }

    public void setIntercomHmaciOS(String intercomHmaciOS) {
        this.intercomHmaciOS = intercomHmaciOS;
    }

    public String getIntercomHmacAndroid() {
        return intercomHmacAndroid;
    }

    public void setIntercomHmacAndroid(String intercomHmacAndroid) {
        this.intercomHmacAndroid = intercomHmacAndroid;
    }

    public Boolean getHasCompletedTutorial() {
        return hasCompletedTutorial;
    }

    public void setHasCompletedTutorial(Boolean hasCompletedTutorial) {
        this.hasCompletedTutorial = hasCompletedTutorial;
    }

    public Integer getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Integer lastPayment) {
        this.lastPayment = lastPayment;
    }

    public Integer getPreviousMoneyboxAmount() {
        return previousMoneyboxAmount;
    }

    public void setPreviousMoneyboxAmount(Integer previousMoneyboxAmount) {
        this.previousMoneyboxAmount = previousMoneyboxAmount;
    }

    public String getMoneyboxRegistrationStatus() {
        return moneyboxRegistrationStatus;
    }

    public void setMoneyboxRegistrationStatus(String moneyboxRegistrationStatus) {
        this.moneyboxRegistrationStatus = moneyboxRegistrationStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getRoundUpWholePounds() {
        return roundUpWholePounds;
    }

    public void setRoundUpWholePounds(Boolean roundUpWholePounds) {
        this.roundUpWholePounds = roundUpWholePounds;
    }

    public Boolean getDoubleRoundUps() {
        return doubleRoundUps;
    }

    public void setDoubleRoundUps(Boolean doubleRoundUps) {
        this.doubleRoundUps = doubleRoundUps;
    }

    public Integer getMoneyboxAmount() {
        return moneyboxAmount;
    }

    public void setMoneyboxAmount(Integer moneyboxAmount) {
        this.moneyboxAmount = moneyboxAmount;
    }

    public Integer getInvestmentTotal() {
        return investmentTotal;
    }

    public void setInvestmentTotal(Integer investmentTotal) {
        this.investmentTotal = investmentTotal;
    }

    public Boolean getCanReinstateMandate() {
        return canReinstateMandate;
    }

    public void setCanReinstateMandate(Boolean canReinstateMandate) {
        this.canReinstateMandate = canReinstateMandate;
    }

    public Boolean getDirectDebitHasBeenSubmitted() {
        return directDebitHasBeenSubmitted;
    }

    public void setDirectDebitHasBeenSubmitted(Boolean directDebitHasBeenSubmitted) {
        this.directDebitHasBeenSubmitted = directDebitHasBeenSubmitted;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getMonthlyBoostEnabled() {
        return monthlyBoostEnabled;
    }

    public void setMonthlyBoostEnabled(Boolean monthlyBoostEnabled) {
        this.monthlyBoostEnabled = monthlyBoostEnabled;
    }

    public Integer getMonthlyBoostAmount() {
        return monthlyBoostAmount;
    }

    public void setMonthlyBoostAmount(Integer monthlyBoostAmount) {
        this.monthlyBoostAmount = monthlyBoostAmount;
    }

    public Integer getMonthlyBoostDay() {
        return monthlyBoostDay;
    }

    public void setMonthlyBoostDay(Integer monthlyBoostDay) {
        this.monthlyBoostDay = monthlyBoostDay;
    }

}