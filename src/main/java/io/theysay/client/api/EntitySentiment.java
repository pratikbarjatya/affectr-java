package io.theysay.client.api;

public class EntitySentiment {
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

    public void setSentiment(SentimentValues sentiment) {
        this.sentiment = sentiment;
    }

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

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentenceHtml() {
        return sentenceHtml;
    }

    public void setSentenceHtml(String sentenceHtml) {
        this.sentenceHtml = sentenceHtml;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHeadNoun() {
        return headNoun;
    }

    public void setHeadNoun(String headNoun) {
        this.headNoun = headNoun;
    }

    public int getHeadNounIndex() {
        return headNounIndex;
    }

    public void setHeadNounIndex(int headNounIndex) {
        this.headNounIndex = headNounIndex;
    }

    public double getSalience() {
        return salience;
    }

    public void setSalience(double salience) {
        this.salience = salience;
    }
}
