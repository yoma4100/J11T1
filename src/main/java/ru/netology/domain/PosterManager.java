package ru.netology.domain;

import ru.netology.PosterItem;
import ru.netology.repository.PosterRepository;

import java.util.Arrays;
import java.util.Collections;

public class PosterManager {
    private PosterRepository repo;
    private int resultLength = 10;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public PosterManager(PosterRepository repo, int a) {
        this.repo = repo;
        this.resultLength = a;
    }

    public void add(PosterItem item) {
        repo.save(item);
    }

    public PosterItem[] findAll() {
        PosterItem[] all = repo.findAll();
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