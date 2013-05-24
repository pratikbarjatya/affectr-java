package io.theysay.affectr.client.api;

/**
 * Sentiment coefficients (0 ≤ d ≤ 100) to control the (in)sensitivity of the sentiment
 * analysis towards p ∈ { positive | neutral | negative } sentiment. Example: bias: { "positive":7.5 }.
 */
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

    public static class Builder {
        private SentimentBias sentimentBias;

        private Builder() {
            sentimentBias = new SentimentBias();
        }

        public Builder withPositive(Double positive) {
            sentimentBias.positive = positive;
            return this;
        }

        public Builder withNegative(Double negative) {
            sentimentBias.negative = negative;
            return this;
        }

        public Builder withNeutral(Double neutral) {
            sentimentBias.neutral = neutral;
            return this;
        }

        public static Builder sentimentBias() {
            return new Builder();
        }

        public SentimentBias build() {
            return sentimentBias;
        }
    }
}
