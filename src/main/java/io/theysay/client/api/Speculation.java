package io.theysay.client.api;

public class Speculation implements HasStartEnd, HasText {
    private int start;
    private int end;
    private int sentenceIndex;
    private String speculationType;
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

    public String getSpeculationType() {
        return speculationType;
    }

    public String getText() {
        return text;
    }
}
