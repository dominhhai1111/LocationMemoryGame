package com.example.admin.locationmemorygame;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by admin on 5/4/2018.
 */

public class RandomMap {
    private int level;
    private Array maps;

    public RandomMap(int level) {
        this.level = level;
        this.setMaps();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Array getMaps() {
        return maps;
    }

    public void setMaps() {
        Random random = new Random();
        for (int i = 0; i < level; i++) {

        }
    }
}
