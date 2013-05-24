package io.theysay.client.api;

public class ChunkConstituent {
    private Chunk chunk;
    private ChunkHead head;

    public Chunk getChunk() {
        return chunk;
    }

    public void setChunk(Chunk chunk) {
        this.chunk = chunk;
    }

    public ChunkHead getHead() {
        return head;
    }

    public void setHead(ChunkHead head) {
        this.head = head;
    }
}
