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

    public void setHead(String head) {
        this.head = head;
    }

    public int getHeadIndex() {
        return headIndex;
    }

    public void setHeadIndex(int headIndex) {
        this.headIndex = headIndex;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentenceHtml() {
        return sentenceHtml;
    }

    public void setSentenceHtml(String sentenceHtml) {
        this.sentenceHtml = sentenceHtml;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getNamedEntityTypes() {
        return namedEntityTypes;
    }

    public void setNamedEntityTypes(String[] namedEntityTypes) {
        this.namedEntityTypes = namedEntityTypes;
    }
}
