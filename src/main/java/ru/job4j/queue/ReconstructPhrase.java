package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        int l = evenElements.size();
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                sb.append(evenElements.pollFirst());
            } else {
                evenElements.poll();
            }
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        int l = descendingElements.size();
        for (int i = 0; i < l; i++) {
            sb.append(descendingElements.pollLast());
        }
        return sb.toString();

    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}