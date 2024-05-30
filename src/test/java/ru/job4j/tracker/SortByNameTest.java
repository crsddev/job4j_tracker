package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SortByNameTest {

    @Test
    public void whenItemSortedAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(7, "test7"),
                new Item(4, "test4"),
                new Item(3, "test3")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "test1"),
                new Item(3, "test3"),
                new Item(4, "test4"),
                new Item(7, "test7")

        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemSortedDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "test1"),
                new Item(4, "test4"),
                new Item(2, "test2"),
                new Item(9, "test9"),
                new Item(7, "test7")
        );
        List<Item> expected = Arrays.asList(
                new Item(9, "test9"),
                new Item(7, "test7"),
                new Item(4, "test4"),
                new Item(2, "test2"),
                new Item(1, "test1")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }

}