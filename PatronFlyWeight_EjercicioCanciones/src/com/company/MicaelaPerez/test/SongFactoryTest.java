package com.company.MicaelaPerez.test;

import com.company.MicaelaPerez.factory.FlyweightSongFactory;
import com.company.MicaelaPerez.models.Song;
import org.junit.Assert;
import org.junit.Test;


public class SongFactoryTest {
    @Test
    public void factoryAddNewSong(){
        //ARRANGE se hace con el factory
        //ACT
        Song turrakaRemix = FlyweightSongFactory.getSong("turrakaRemix");
        //ASSERT
        Assert.assertEquals("turrakaRemix", turrakaRemix.getName());
    }

    @Test
    public void factoryReturnsExistingSong(){
        //ARRANGE
        Song turrakaRemix = FlyweightSongFactory.getSong("turrakaRemix");
        //ACT
        Song turrakaRemix2 = FlyweightSongFactory.getSong("turrakaRemix");
        //ASSERT
        Assert.assertEquals(1, FlyweightSongFactory.getSongHashMap().size());
    }

    @Test
    public void factoryAddsTwoNewSongs(){
        //ARRANGE
        Song turraka = FlyweightSongFactory.getSong("turraka");
        //ACT
        Song turromantiko = FlyweightSongFactory.getSong("algendarmequee");
        //ASSERTS
        Assert.assertEquals(2, FlyweightSongFactory.getSongHashMap().size());
    }


}