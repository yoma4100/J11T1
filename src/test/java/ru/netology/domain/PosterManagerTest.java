package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterItem;



public class PosterManagerTest {
    PosterManager manager = new PosterManager();
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
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeLessThenResultSize() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);

        PosterItem[] expected = {item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeEqualsResultSize() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);

        PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    //

    @Test
    public void shouldShowLastEightFilmsWhenArraySizeMoreThenResultSize() {
        PosterManager manager = new PosterManager(8);
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        manager.save(item11);

        PosterItem[] expected = {item11, item10, item9, item8, item7, item6, item5, item4};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeLessThenResultSizeCustom() {
        PosterManager manager = new PosterManager(8);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);


        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllFilmsWhenArraySizeEqualsResultSizeCustom() {
        PosterManager manager = new PosterManager(8);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);

        PosterItem[] expected = {item8, item7, item6, item5, item4, item3, item2, item1};
        PosterItem[] actual = manager.returnReversed();

        Assertions.assertArrayEquals(expected, actual);
    }
}
