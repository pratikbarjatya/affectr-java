package io.theysay.client.api;

public class EntitySentiment implements HasStartEnd, HasText {
    private SentimentValues sentiment;
    private int start;
    private int end;
    private String sentence;
    private String sentenceHtml;
    private String text;
    private String headNoun;
    private int headNounIndex;
    private double salience;

    public SentimentValues getSentiment() {
        return sentiment;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getSentence() {
        return sentence;
    }

    public String getSentenceHtml() {
        return sentenceHtml;
    }

    public String getText() {
        return text;
    }

    public String getHeadNoun() {
        return headNoun;
    }

    public int getHeadNounIndex() {
        return headNounIndex;
    }

    public double getSalience() {
        return salience;
    }
}
