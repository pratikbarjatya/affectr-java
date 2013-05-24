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

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSentenceIndex() {
        return sentenceIndex;
    }

    public void setSentenceIndex(int sentenceIndex) {
        this.sentenceIndex = sentenceIndex;
    }

    public String getSpeculationType() {
        return speculationType;
    }

    public void setSpeculationType(String speculationType) {
        this.speculationType = speculationType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
