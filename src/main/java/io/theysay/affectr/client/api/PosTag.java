package io.theysay.affectr.client.api;

public class PosTag implements HasText {
    private String posTag;
    private String posTaggedWord;
    private int sentenceIndex;
    private String stem;
    private String text;
    private int wordIndex;

    public String getPosTag() {
        return posTag;
    }

    public String getPosTaggedWord() {
        return posTaggedWord;
    }

    public int getSentenceIndex() {
        return sentenceIndex;
    }

    public String getStem() {
        return stem;
    }

    public String getText() {
        return text;
    }

    public int getWordIndex() {
        return wordIndex;
    }
}
