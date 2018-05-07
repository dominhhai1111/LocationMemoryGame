package com.example.admin.locationmemorygame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by admin on 5/4/2018.
 */

public class RandomMap {
    private int level;
    private int count;
    private int time;
    private ArrayList<Integer> appointees = new ArrayList<>();

    public RandomMap(int level) {
        this.level = level;
        this.setCount(this.level);
        this.setTime(this.level);
        this.setAppointees(this.count);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int level) {
        if (level <= 5) {
            count = 16;
        } else if (5 < level && level <= 10) {
            count = 20;
        }
        this.count = count;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int level) {
        this.time = 1;
    }

    public ArrayList getAppointees() {
        return appointees;
    }

    public void setAppointees(int count) {
        Random random = new Random();
        int appointee;
        do {
            do {
                appointee = random.nextInt(count);
            } while (this.appointees.contains(appointee));
            this.appointees.add(appointee);
        } while (this.appointees.size() == count);
    }
}
