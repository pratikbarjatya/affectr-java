package io.theysay.client.api;

public class Intent implements HasStartEnd, HasText {
    private int start;
    private int end;
    private int sentenceIndex;
    private String intentType;
    private String text;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getSentenceIndex() {
        return sentenceIndex;
    }

    public String getIntentType() {
        return intentType;
    }

    public String getText() {
        return text;
    }
}
