package com.uno;

public class ReverseCard extends Card {
    final Colors color;

    ReverseCard(Colors color) {
        super(CardTypes.REVERSE);
        this.color = color;
    }
}
