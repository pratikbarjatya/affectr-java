package io.theysay.affectr.client.api;

public class Chunk implements HasStartEnd, HasText {
    private String chunkType;
    private int start;
    private int end;
    private String text;
    private int sentenceIndex;

    public String getChunkType() {
        return chunkType;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getText() {
        return text;
    }

    public int getSentenceIndex() {
        return sentenceIndex;
    }
}
