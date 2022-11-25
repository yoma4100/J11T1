package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PosterItem;
import ru.netology.repository.PosterRepository;


public class PosterManagerTest {
    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo, 10);
    PosterItem item1 = new PosterItem(1, "Film1");
    PosterItem item2 = new PosterItem(2, "Film2");
    PosterItem item3 = new PosterItem(3, "Film3");
    PosterItem item4 = new PosterItem(4, "Film4");
    PosterItem item5 = new PosterItem(5, "Film5");
    PosterItem item6 = new PosterItem(6, "Film6");
    PosterItem item7 = new PosterItem(7, "Film7");
    PosterItem item8 = new PosterItem(8, "Film8");
    PosterItem item9 = new PosterItem(9, "Film9");
    PosterItem item10 = new PosterItem(10, "Film10");
    PosterItem item11 = new PosterItem(11, "Film11");

    @Test
    public void shouldShowLastTenFilmsWhenArraySizeMoreThenResultSize() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeLessThenResultSize() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);

        PosterItem[] expected = {item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeEqualsResultSize() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);

        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
