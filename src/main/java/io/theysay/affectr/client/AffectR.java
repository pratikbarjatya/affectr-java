package io.theysay.affectr.client;

import io.theysay.affectr.client.api.Api;

public class AffectR {
    public final static String VERSION = "1.0.0";

    public final static AccountDetails accountDetails = new AccountDetails();

    public final static Api api = new Api(accountDetails);
}
