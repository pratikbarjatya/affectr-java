package io.theysay.affectr.client.api;

public class Request {
    private String text;
    private String level;
    private Double ratio; // only used for summaries
    private String targets;
    private String matching;
    private SentimentBias bias;

    public Request() {
    }

    public Request(String text) {
        this.text = text;
    }

    public Request(String text, String level) {
        this.text = text;
        this.level = level;
    }

    public Request(String text, Double ratio) {
        this.text = text;
        this.ratio = ratio;
    }

    public Request(String text, String level, String targets) {
        this.text = text;
        this.level = level;
        this.targets = targets;
    }

    public Request(String text, String level, String targets, String matching) {
        this.text = text;
        this.level = level;
        this.targets = targets;
        this.matching = matching;
    }

    public Request(String text, String level, String targets, String matching, SentimentBias bias) {
        this.text = text;
        this.level = level;
        this.targets = targets;
        this.matching = matching;
        this.bias = bias;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets;
    }

    public String getMatching() {
        return matching;
    }

    public void setMatching(String matching) {
        this.matching = matching;
    }

    public SentimentBias getBias() {
        return bias;
    }

    public void setBias(SentimentBias bias) {
        this.bias = bias;
    }
}
