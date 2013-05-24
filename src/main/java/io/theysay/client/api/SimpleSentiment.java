package io.theysay.client.api;

public class SimpleSentiment {
    private SentimentScore sentiment;
    private Integer wordCount;

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public Integer getWordCount() {
        return wordCount;
    }
}