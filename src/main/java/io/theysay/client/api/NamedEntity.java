package io.theysay.client.api;

public class NamedEntity implements HasStartEnd {
    private String head;
    private int headIndex;
    private int start;
    private int end;
    private String sentence;
    private String sentenceHtml;
    private String text;
    private String[] namedEntityTypes;

    public String getHead() {
        return head;
    }

    public int getHeadIndex() {
        return headIndex;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getSentence() {
        return sentence;
    }

    public String getSentenceHtml() {
        return sentenceHtml;
    }

    public String getText() {
        return text;
    }

    public String[] getNamedEntityTypes() {
        return namedEntityTypes;
    }
}
