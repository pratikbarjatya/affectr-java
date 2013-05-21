package io.theysay.client.api;

import java.io.Serializable;

public class SimpleSentiment implements Serializable {
    private SentimentValues sentiment;
    private Integer wordCount;

    public SentimentValues getSentiment() {
        return sentiment;
    }

    public void setSentiment(SentimentValues sentiment) {
        this.sentiment = sentiment;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }
}
