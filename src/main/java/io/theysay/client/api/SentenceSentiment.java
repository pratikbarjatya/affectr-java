package io.theysay.client.api;

public class SentenceSentiment implements HasStartEnd, HasText {
    private SentimentScore sentiment;
    private int start;
    private int end;
    private String text;

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getText() {
        return text;
    }
}
