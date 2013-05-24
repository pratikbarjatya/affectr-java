package io.theysay.affectr.client.api;

public class ChunkHead implements HasText {
    private String posTag;
    private String posTaggedWord;
    private String stem;
    private String text;
    private int wordIndex;

    public String getPosTag() {
        return posTag;
    }

    public String getPosTaggedWord() {
        return posTaggedWord;
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
