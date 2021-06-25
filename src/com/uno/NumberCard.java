package com.uno;

public class NumberCard extends Card {
    protected int val;
    protected Colors col;

    public NumberCard(Colors color, int val) {
        super(CardTypes.NUMBER);
        this.val = val;
        this.col = color;
    }

    public int value() {
        return this.val;
    }

    public Colors color() {
        return this.col;
    }
}
