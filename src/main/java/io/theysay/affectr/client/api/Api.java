package io.theysay.affectr.client.api;

import io.theysay.affectr.client.AccountDetails;
import io.theysay.affectr.client.utils.HttpClient;
import org.apache.commons.codec.binary.Base64;

import java.util.HashMap;
import java.util.Map;

import static io.theysay.affectr.client.utils.JsonUtils.fromJson;
import static io.theysay.affectr.client.utils.JsonUtils.toJson;
import static java.lang.String.format;

public class Api {

    public interface Path {
        public static final String BASE = "http://api.theysay.io";
        public static final String SENTIMENT = format("%s/v1/sentiment", BASE);
        public static final String SPECULATION = format("%s/v1/speculation", BASE);
        public static final String INTENT = format("%s/v1/intent", BASE);
        public static final String RISK = format("%s/v1/risk", BASE);
        public static final String COMPARISON = format("%s/v1/comparison", BASE);
        public static final String NAMED_ENTITY = format("%s/v1/namedentity", BASE);
        public static final String POS_TAG = format("%s/v1/postag", BASE);
        public static final String CHUNK_PARSE = format("%s/v1/chunkparse", BASE);
        public static final String VERSION = format("%s/version", BASE);
    }

    protected HttpClient httpClient = HttpClient.DEFAULT;

    protected AccountDetails accountDetails;

    public Api(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    /**
     * Classifies sentiment for the passed-in text.
     *
     * @param text the text to classify
     * @return a SimpleSentiment object
     */
    public SimpleSentiment classifySentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text))), SimpleSentiment.class);
    }

    public SentenceSentiment[] classifySentenceSentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "sentence"))), SentenceSentiment[].class);
    }

    public WordSentiment[] classifyWordSentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "word"))), WordSentiment[].class);
    }

    /**
     * Classifies sentiment for each detected entity in the passed-in text.
     *
     * @param text the text to classify
     * @return an EntitySentiment object for each entity
     */
    public EntitySentiment[] classifyEntitySentiment(String text) {
        return classifyEntitySentiment(text, null, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets) {
        return classifyEntitySentiment(text, targets, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets, String matching) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entity", targets, matching))), EntitySentiment[].class);
    }

    public AggregateEntitySentiment[] classifyAggregatedEntitySentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entityaggregate"))), AggregateEntitySentiment[].class);
    }

    public TaxonomyEntitySentiment[] classifyTaxonomyEntitySentiment(String text) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entitytaxonomy"))), TaxonomyEntitySentiment[].class);
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

    public ChunkConstituent[] chunkParse(String text) {
        return fromJson(httpClient.post(Path.CHUNK_PARSE, headers(), toJson(new Request(text))), ChunkConstituent[].class);
    }

    public Version getAPIVersion() {
        return fromJson(httpClient.get(Path.VERSION, headers()), Version.class);
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<String, String>();
        String userPass = accountDetails.getUsername() + ":" + accountDetails.getPassword();
        headers.put("Authorization", format("Basic %s", Base64.encodeBase64String(userPass.getBytes())));
        return headers;
    }
}
