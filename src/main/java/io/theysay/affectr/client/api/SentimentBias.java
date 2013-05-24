package io.theysay.affectr.client.api;

public class SentimentBias {
    private Double positive;
    private Double negative;
    private Double neutral;

    public SentimentBias() {
    }

    public SentimentBias(Double positive, Double negative, Double neutral) {
        this.positive = positive;
        this.negative = negative;
        this.neutral = neutral;
    }

    public Double getPositive() {
        return positive;
    }

    public void setPositive(Double positive) {
        this.positive = positive;
    }

    public Double getNegative() {
        return negative;
    }

    public void setNegative(Double negative) {
        this.negative = negative;
    }

    public Double getNeutral() {
        return neutral;
    }

    public void setNeutral(Double neutral) {
        this.neutral = neutral;
    }
}
