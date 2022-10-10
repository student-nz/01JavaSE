package com.yj.nz.oop.oop1.demo3;

public class Test1 {
    public static void main(String[] args) {
        Computer computer=new Computer("I9","2080",16);
       /* computer.cpu="i9";
        computer.gpu="GTX1080Ti";
        computer.ram=16;
        computer.brand="联想";
        computer.type="Y7000p";*/
        computer.start();
        computer.run();
        computer.shutDown();



    }
}
