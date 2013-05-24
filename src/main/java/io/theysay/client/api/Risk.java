package io.theysay.client.api;

public class Risk implements HasStartEnd, HasText {
    private int start;
    private int end;
    private int sentenceIndex;
    private String riskType;
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

    public String getRiskType() {
        return riskType;
    }

    public String getText() {
        return text;
    }
}
