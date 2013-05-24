package io.theysay.affectr.client.api;

public class AggregatedEntity implements HasStartEnd, HasText {
    private SentimentScore sentiment;
    private int start;
    private int end;
    private String sentence;
    private String sentenceHtml;
    private String text;
    private String headNoun;
    private int headNounIndex;
    private double salience;

    public SentimentScore getSentiment() {
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
