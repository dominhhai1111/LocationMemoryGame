package com.example.admin.locationmemorygame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by admin on 5/4/2018.
 */

public class RandomMap {
    private int level;
    private int elements;
    private ArrayList<Integer> maps;

    public RandomMap(int level) {
        this.level = level;
        this.setElememts();
        this.setMaps();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Integer> getMaps() {
        return maps;
    }

    public int getElements() {
        return elements;
    }

    public void setElements(int elements) {
        this.elements = elements;
    }

    public void setMaps() {
        Random random = new Random();
        int choosenLocation;
        for (int i = 0; i < level; i++) {
            do {
                choosenLocation = random.nextInt(level);
            } while (this.maps.contains(choosenLocation));
            this.maps.add(choosenLocation);
        }
    }
}
