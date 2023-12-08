package DesignPatterns.MagicalGiftItems;

import DesignPatterns.MainPlayer;

public interface MagicalGifts {
    String magicalGiftName = "";
    String magicalGiftStory = "";
    int coins = 0;


    public String getMagicalGiftName();
    public String getMagicalGiftStory();
    public int getCoins();
}
