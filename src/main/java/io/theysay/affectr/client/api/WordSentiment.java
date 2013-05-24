package io.theysay.affectr.client.api;

public class WordSentiment {
    private WordPolarityTimeline sentiment;
    private int wordIndex;
    private String text;

    public WordPolarityTimeline getSentiment() {
        return sentiment;
    }

    public int getWordIndex() {
        return wordIndex;
    }

    public String getText() {
        return text;
    }
}
