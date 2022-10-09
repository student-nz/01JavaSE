package com.yj.nz.projectb.typing;

public class Levels {
    public static Level[] levels = new Level[7];

    static {
        levels[0] = new Level(1, 3, 40, 10, 4);
        levels[1] = new Level(2, 4, 36, 20, 9);
        levels[2] = new Level(3, 4, 32, 40, 8);
        levels[3] = new Level(4, 5, 28, 60, 7);
        levels[4] = new Level(5, 6, 24, 100, 6);
        levels[5] = new Level(6, 7, 20, 180, 5);
        levels[6] = new Level(7, 8, 16, 300, 5);
    }
}
