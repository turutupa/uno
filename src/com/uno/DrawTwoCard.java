package com.uno;

public class DrawTwoCard extends Card {
    private final Colors _color;

    DrawTwoCard(Colors color) {
        super(CardTypes.DRAWTWO);
        this._color = color;
    }

    public Colors color() {
        return this._color;
    }
}
