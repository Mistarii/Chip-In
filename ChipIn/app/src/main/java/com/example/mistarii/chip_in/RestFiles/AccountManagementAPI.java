package com.example.mistarii.chip_in.RestFiles;

import android.os.Debug;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
//import java.net.HttpURLConnection*;

public class AccountManagementAPI {
    private string apiKey = "QsypVK0SKMd1WRqVy9Rc";
    public string accounts = "/accounts";
    private string targetAccount;




    //calls the create account REST call to API
    string GetAccounts() throws MalformedURLException {
        try{
        URL getAccountsURL = new URL("https://us-central1-incomm-hackathon-api.cloudfunctions.net/api/accounts");
        HttpURLConnection getAccountconnection = (HttpURLConnection) getAccountsURL.openConnection();
        getAccountconnection.setRequestMethod("GET");

        if (getAccountconnection.getResponseCode() != 200){
                throw new RuntimeException("Failed Https error code: " + getAccountconnection.getResponseCode());
            }
    }
    catch (IOException e) {
            e.printStackTrace();
        }

        //calls the get account REST call to api
    //void getAccounts(){

        return baseURL;
    }

    void deleteAccount() {

    }


}
