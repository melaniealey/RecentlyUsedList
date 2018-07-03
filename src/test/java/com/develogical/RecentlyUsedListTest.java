package com.develogical;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RecentlyUsedListTest {

    @Test
    public void emptyWhenInitialised(){
        assertThat(new RecentlyUsedList().isEmpty(), equalTo(true));
    }


    @Test
    public void canAddtoList(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(12345);
        assertThat(list.isEmpty(), equalTo(false));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void errorIfOutOfBounds(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.retrieve(-10);
    }

    @Test
    public void canRetrieveItem(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(list.retrieve(1), equalTo(2));
    }

    @Test
    public void insertionsOrderedNotDuplicated(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(12345); //length is 1

        list.add(23456); //length is 2
        assertThat(list.getLenth(), equalTo(2));

        list.add(12345); //length is still 2
        assertThat(list.getLenth(), equalTo(2));

        assertThat(list.retrieve(0), equalTo(12345));  //most recent still on top

        //check no duplicates!

    }



}
