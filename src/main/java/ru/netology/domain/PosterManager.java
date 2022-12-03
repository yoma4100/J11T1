package ru.netology.domain;

import ru.netology.PosterItem;


public class PosterManager {
    private int resultLength = 10;
    private PosterItem[] items = new PosterItem[0];

    public PosterManager() {
    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] returnReversed() {
        PosterItem[] all = findAll();
        PosterItem[] reversed = new PosterItem[all.length];
        PosterItem[] tmp;
        if (all.length >= this.resultLength) {
            tmp = new PosterItem[this.resultLength];
            for (int i = 0; i < this.resultLength; i++) {
                tmp[i] = all[all.length - i - 1];
                reversed = tmp;
            }
        } else {
            tmp = new PosterItem[all.length];
            for (int i = 0; i < all.length; i++) {
                tmp[i] = all[all.length - 1 - i];
                reversed = tmp;
            }
        }
        return reversed;
    }
}