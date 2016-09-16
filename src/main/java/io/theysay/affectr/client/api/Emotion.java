package io.theysay.affectr.client.api;

public class Emotion implements HasStartEnd {
    private int start;
    private int end;
    private int sentenceIndex;
    private String dimension;
    private String score;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getSentenceIndex() {
        return sentenceIndex;
    }

    public String getEmotionType() {
        return dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public String getScore() {
        return score;
    }

}
