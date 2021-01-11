package com.github.cemicyz.computerapi;

final class Sample {

    /*
    Is your computer turned on? Find it out with this API
    */

    public static void main(String[] args) {
        System.out.println("Computer is : " + (ComputerAPI.isOn() ? "on" : "off"));
    }
}