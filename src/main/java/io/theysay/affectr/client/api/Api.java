package io.theysay.affectr.client.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
        public static final String EMOTION = format("%s/v1/emotion", BASE);
        public static final String COMPARISON = format("%s/v1/comparison", BASE);
        public static final String NAMED_ENTITY = format("%s/v1/namedentity", BASE);
        public static final String POS_TAG = format("%s/v1/postag", BASE);
        public static final String DEPENDENCY_PARSE = format("%s/v1/depparse", BASE);
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
        return classifySentiment(text, null);
    }

    public SimpleSentiment classifySentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, bias))), SimpleSentiment.class);
    }

    public SentenceSentiment[] classifySentenceSentiment(String text) {
        return classifySentenceSentiment(text, null);
    }

    public SentenceSentiment[] classifySentenceSentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "sentence", bias))), SentenceSentiment[].class);
    }

    public WordSentiment[] classifyWordSentiment(String text) {
        return classifyWordSentiment(text, null);
    }

    public WordSentiment[] classifyWordSentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "word", bias))), WordSentiment[].class);
    }

    /**
     * Classifies sentiment for each detected entity in the passed-in text.
     *
     * @param text the text to classify
     * @return an EntitySentiment object for each entity
     */
    public EntitySentiment[] classifyEntitySentiment(String text) {
        return classifyEntitySentiment(text, null, null, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, SentimentBias bias) {
        return classifyEntitySentiment(text, null, null, bias);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets) {
        return classifyEntitySentiment(text, targets, null, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets, SentimentBias bias) {
        return classifyEntitySentiment(text, targets, null, bias);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets, String matching) {
        return classifyEntitySentiment(text, targets, matching, null);
    }

    public EntitySentiment[] classifyEntitySentiment(String text, String targets, String matching, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entity", targets, matching, bias))), EntitySentiment[].class);
    }

    public AggregateEntitySentiment[] classifyAggregatedEntitySentiment(String text) {
        return classifyAggregatedEntitySentiment(text, null);
    }

    public AggregateEntitySentiment[] classifyAggregatedEntitySentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entityaggregate", bias))), AggregateEntitySentiment[].class);
    }

    public TaxonomyEntitySentiment[] classifyTaxonomyEntitySentiment(String text) {
        return classifyTaxonomyEntitySentiment(text, null);
    }

    public TaxonomyEntitySentiment[] classifyTaxonomyEntitySentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entitytaxonomy", bias))), TaxonomyEntitySentiment[].class);
    }

    public EntityRelationSentiment[] classifyEntityRelationSentiment(String text) {
        return classifyEntityRelationSentiment(text, null);
    }

    public EntityRelationSentiment[] classifyEntityRelationSentiment(String text, SentimentBias bias) {
        return fromJson(httpClient.post(Path.SENTIMENT, headers(), toJson(new Request(text, "entityrelation", bias))), EntityRelationSentiment[].class);
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

    public Emotion[] classifyEmotion(String text) {
        JsonObject responseObj = fromJson(httpClient.post(Path.EMOTION, headers(), toJson(new Request(text))), JsonElement.class).getAsJsonObject();
        String json = toJson(responseObj.getAsJsonArray("emotions"));
        return fromJson(json, Emotion[].class);
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

    public DependencyParse[] dependencyParse(String text) {
        return fromJson(httpClient.post(Path.DEPENDENCY_PARSE, headers(), toJson(new Request(text))), DependencyParse[].class);
    }

    public ChunkConstituent[] chunkParse(String text) {
        return fromJson(httpClient.post(Path.CHUNK_PARSE, headers(), toJson(new Request(text))), ChunkConstituent[].class);
    }

    public Version getVersion() {
        // Typically {"Preceive-API":{"version":"x.y.z"},"AffectR-Engine":{"version":"x.y.z"}}
        JsonObject responseObj = fromJson(httpClient.get(Path.VERSION, headers()), JsonElement.class).getAsJsonObject();
        JsonObject jsonObj = responseObj.getAsJsonObject("Preceive-API");
        String engineVersion = responseObj.getAsJsonObject("AffectR-Engine").get("version").toString();
        jsonObj.addProperty("name","Preceive-API");
        jsonObj.addProperty("engineVersion", engineVersion);
        String json = toJson(jsonObj);
        return fromJson(json, Version.class);
    }

    protected Map<String, String> headers() {
        Map<String, String> headers = new HashMap<String, String>();
        String userPass = accountDetails.getUsername() + ":" + accountDetails.getPassword();
        headers.put("Authorization", format("Basic %s", Base64.encodeBase64String(userPass.getBytes())));
        return headers;
    }
}
