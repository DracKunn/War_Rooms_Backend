package model

data class Card(
    val suite: Suite,
    val rank: Rank

)

public enum class Suite {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

enum class Rank {
    ACE,
    KING,
    QUEEN,
    JACK,
    TEN,
    NINE,
    EIGHT,
    SEVEN,
    SIX,
    FIVE,
    FOUR,
    THREE,
    TWO,
}

