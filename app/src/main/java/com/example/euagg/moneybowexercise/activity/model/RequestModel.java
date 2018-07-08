package com.example.euagg.moneybowexercise.activity.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestModel {

    @SerializedName("User")
    @Expose
    private User user;
    @SerializedName("Session")
    @Expose
    private Session session;

    /**
     * No args constructor for use in serialization
     *
     */
    public RequestModel() {
    }

    /**
     *
     * @param session
     * @param user
     */
    public RequestModel(User user, Session session) {
        super();
        this.user = user;
        this.session = session;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }



}