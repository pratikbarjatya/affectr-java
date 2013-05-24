package io.theysay.affectr.client.api;

import java.util.List;

public class TaxonomyEntitySentiment {
    private String category;
    private int level;
    private int frequency;
    private SentimentScore sentiment;
    private double salience;
    private List<TaxonomyEntity> mentions;

    public String getCategory() {
        return category;
    }

    public int getLevel() {
        return level;
    }

    public int getFrequency() {
        return frequency;
    }

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public double getSalience() {
        return salience;
    }

    public List<TaxonomyEntity> getMentions() {
        return mentions;
    }
}
