package io.theysay.client.api;

import io.theysay.client.AccountDetails;
import io.theysay.client.utils.HttpClient;
import org.apache.commons.codec.binary.Base64;

import java.util.HashMap;
import java.util.Map;

import static io.theysay.client.utils.JsonUtils.fromJson;
import static io.theysay.client.utils.JsonUtils.toJson;
import static java.lang.String.format;

public class Api {

    public interface Path {
        public static final String BASE = "http://api.theysay.io/v1";
        public static final String SENTIMENT = format("%s/sentiment", BASE);
        public static final String SPECULATION = format("%s/speculation", BASE);
        public static final String INTENT = format("%s/intent", BASE);
        public static final String RISK = format("%s/risk", BASE);

    }

    protected HttpClient httpClient = HttpClient.DEFAULT;

    protected AccountDetails accountDetails;

    public Api(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public SimpleSentiment analyseSentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text))), SimpleSentiment.class);
    }

    public Speculation[] analyseSpeculation(String text) {
        return fromJson(httpClient.post(Path.SPECULATION, headers(), toJson(new Request(text))), Speculation[].class);
    }

    public Intent[] analyseIntent(String text) {
        return fromJson(httpClient.post(Path.INTENT, headers(), toJson(new Request(text))), Intent[].class);
    }

    public Risk[] analyseRisk(String text) {
        return fromJson(httpClient.post(Path.RISK, headers(), toJson(new Request(text))), Risk[].class);
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<String, String>();
        String userPass = accountDetails.getUsername() + ":" + accountDetails.getPassword();
        headers.put("Authorization", format("Basic %s", Base64.encodeBase64String(userPass.getBytes())));
        return headers;
    }
}
