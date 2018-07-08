package com.example.euagg.moneybowexercise.activity;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetConnection {

    //  Method to get if there is internet connection
    public static boolean isConnected() throws InterruptedException, IOException
    {
        String command = "ping -c 1 google.com";
        return (Runtime.getRuntime().exec(command).waitFor() == 0);

    }
}
