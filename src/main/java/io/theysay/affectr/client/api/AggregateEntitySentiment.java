package io.theysay.affectr.client.api;

import java.util.List;

public class AggregateEntitySentiment {
    private String category;
    private int frequency;
    private SentimentScore sentiment;
    private double salience;
    private List<AggregatedEntity> mentions;

    public String getCategory() {
        return category;
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

    public List<AggregatedEntity> getMentions() {
        return mentions;
    }
}
