package io.theysay.client.api;

public class ChunkHead {
    private String posTag;
    private String posTaggedWord;
    private String stem;
    private String text;
    private int wordIndex;

    public String getPosTag() {
        return posTag;
    }

    public void setPosTag(String posTag) {
        this.posTag = posTag;
    }

    public String getPosTaggedWord() {
        return posTaggedWord;
    }

    public void setPosTaggedWord(String posTaggedWord) {
        this.posTaggedWord = posTaggedWord;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWordIndex() {
        return wordIndex;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }
}