package io.theysay.client;

import io.theysay.client.api.Api;

public class Affectr {
    public final static String VERSION = "1.0.0";

    public final static AccountDetails accountDetails = new AccountDetails();

    public final static Api api = new Api(accountDetails);

    public final static String API_PATH = "/v1";
}
