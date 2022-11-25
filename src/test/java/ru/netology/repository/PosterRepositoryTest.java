package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.PosterItem;


public class PosterRepositoryTest {
    PosterRepository repo = new PosterRepository();
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

    @BeforeEach
    public void setUp() {
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);
        repo.save(item11);
    }

    @Test
    public void shouldShowLastTenFilms() {
        PosterItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};

        PosterItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
