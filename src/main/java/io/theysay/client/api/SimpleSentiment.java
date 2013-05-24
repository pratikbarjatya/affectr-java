package io.theysay.client.api;

public class SimpleSentiment {
    private SentimentValues sentiment;
    private Integer wordCount;

    public SentimentValues getSentiment() {
        return sentiment;
    }

    public Integer getWordCount() {
        return wordCount;
    }
}