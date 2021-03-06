package io.theysay.affectr.client.api;

public class EntityRelationSentiment {
    private RelatedEntity entity1;
    private RelatedEntity entity2;
    private SentimentScore sentiment;
    private double salience;
    private String sentence;
    private String sentenceHtml;

    public RelatedEntity getEntity1() {
        return entity1;
    }

    public RelatedEntity getEntity2() {
        return entity2;
    }

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public double getSalience() {
        return salience;
    }

    public String getSentence() {
        return sentence;
    }

    public String getSentenceHtml() {
        return sentenceHtml;
    }
}
