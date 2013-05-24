package io.theysay.client.api;

/**
 * Java object to describe sentiment values returned by the Affectr API. The label (or polarity) will contain either
 * POSITIVE, NEUTRAL or NEGATIVE.
 */
public class SentimentValues {
    private String label;
    private double positive;
    private double negative;
    private double neutral;

    public String getPolarity() {
        return label;
    }

    public String getLabel() {
        return label;
    }

    public double getPositive() {
        return positive;
    }

    public double getNegative() {
        return negative;
    }

    public double getNeutral() {
        return neutral;
    }
}
