package io.theysay.affectr.client.api;

import io.theysay.affectr.client.RelatedEntity1;

public class EntityRelationSentiment {
    private RelatedEntity1 entity1;
    private RelatedEntity2 entity2;
    private SentimentScore sentiment;
    private Double salience;
    private String sentence;
    private String sentenceHtml;

    public RelatedEntity1 getEntity1() {
        return entity1;
    }

    public void setEntity1(RelatedEntity1 entity1) {
        this.entity1 = entity1;
    }

    public RelatedEntity2 getEntity2() {
        return entity2;
    }

    public void setEntity2(RelatedEntity2 entity2) {
        this.entity2 = entity2;
    }

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public void setSentiment(SentimentScore sentiment) {
        this.sentiment = sentiment;
    }

    public Double getSalience() {
        return salience;
    }

    public void setSalience(Double salience) {
        this.salience = salience;
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
}
