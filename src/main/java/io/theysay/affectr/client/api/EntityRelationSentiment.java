package io.theysay.affectr.client.api;

import io.theysay.affectr.client.RelatedEntity1;

public class EntityRelationSentiment {
    private RelatedEntity1 entity1;
    private RelatedEntity2 entity2;
    private SentimentScore sentiment;
    private double salience;
    private String sentence;
    private String sentenceHtml;

    public RelatedEntity1 getEntity1() {
        return entity1;
    }

    public RelatedEntity2 getEntity2() {
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
