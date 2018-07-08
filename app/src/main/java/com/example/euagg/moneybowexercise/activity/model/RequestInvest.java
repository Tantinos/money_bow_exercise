package com.example.euagg.moneybowexercise.activity.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestInvest {

    @SerializedName("Products")
    @Expose
    private List<Product> products = null;
    @SerializedName("SelectedInvestorProductId")
    @Expose
    private Integer selectedInvestorProductId;
    @SerializedName("FavouriteInvestorProductId")
    @Expose
    private Integer favouriteInvestorProductId;
    @SerializedName("Transactions")
    @Expose
    private List<Object> transactions = null;
    @SerializedName("Links")
    @Expose
    private List<Object> links = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public RequestInvest() {
    }

    /**
     *
     * @param transactions
     * @param selectedInvestorProductId
     * @param links
     * @param favouriteInvestorProductId
     * @param products
     */
    public RequestInvest(List<Product> products, Integer selectedInvestorProductId, Integer favouriteInvestorProductId, List<Object> transactions, List<Object> links) {
        super();
        this.products = products;
        this.selectedInvestorProductId = selectedInvestorProductId;
        this.favouriteInvestorProductId = favouriteInvestorProductId;
        this.transactions = transactions;
        this.links = links;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getSelectedInvestorProductId() {
        return selectedInvestorProductId;
    }

    public void setSelectedInvestorProductId(Integer selectedInvestorProductId) {
        this.selectedInvestorProductId = selectedInvestorProductId;
    }

    public Integer getFavouriteInvestorProductId() {
        return favouriteInvestorProductId;
    }

    public void setFavouriteInvestorProductId(Integer favouriteInvestorProductId) {
        this.favouriteInvestorProductId = favouriteInvestorProductId;
    }

    public List<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Object> transactions) {
        this.transactions = transactions;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

}