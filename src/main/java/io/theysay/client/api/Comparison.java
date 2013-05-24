package io.theysay.client.api;

public class Comparison implements HasStartEnd, HasText {
    private int start;
    private int end;
    private int sentenceIndex;
    private String comparisonType;
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

    public String getComparisonType() {
        return comparisonType;
    }

    public String getText() {
        return text;
    }
}
