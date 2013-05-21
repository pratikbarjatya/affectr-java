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
        public static final String COMPARISON = format("%s/comparison", BASE);
        public static final String NAMED_ENTITY = format("%s/namedentity", BASE);
        public static final String POS_TAG = format("%s/postag", BASE);
    }

    protected HttpClient httpClient = HttpClient.DEFAULT;

    protected AccountDetails accountDetails;

    public Api(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public SimpleSentiment classifySentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text))), SimpleSentiment.class);
    }

    public EntitySentiment[] classifyEntitySentiment(String text) {
        return classifyEntitySentiment(text, null, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets) {
        return classifyEntitySentiment(text, targets, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets, String matching) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entity", targets, matching))), EntitySentiment[].class);
    }

    public Speculation[] classifySpeculation(String text) {
        return fromJson(httpClient.post(Path.SPECULATION, headers(), toJson(new Request(text))), Speculation[].class);
    }

    public Intent[] classifyIntent(String text) {
        return fromJson(httpClient.post(Path.INTENT, headers(), toJson(new Request(text))), Intent[].class);
    }

    public Risk[] classifyRisk(String text) {
        return fromJson(httpClient.post(Path.RISK, headers(), toJson(new Request(text))), Risk[].class);
    }

    public Comparison[] classifyComparison(String text) {
        return fromJson(httpClient.post(Path.COMPARISON, headers(), toJson(new Request(text))), Comparison[].class);
    }

    public NamedEntity[] getNamedEntities(String text) {
        return fromJson(httpClient.post(Path.NAMED_ENTITY, headers(), toJson(new Request(text))), NamedEntity[].class);
    }

    public PosTag[] posTag(String text) {
        return fromJson(httpClient.post(Path.POS_TAG, headers(), toJson(new Request(text))), PosTag[].class);
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<String, String>();
        String userPass = accountDetails.getUsername() + ":" + accountDetails.getPassword();
        headers.put("Authorization", format("Basic %s", Base64.encodeBase64String(userPass.getBytes())));
        return headers;
    }
}
