package ru.netology.repository;

import ru.netology.PosterItem;

public class PosterRepository {
    private PosterItem[] items = new PosterItem[0];

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length+1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length-1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }
}