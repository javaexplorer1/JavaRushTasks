package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
       Class[] playlist = { new DoomMetal().getClass(),  new HeavyMetal().getClass(), new GlamMetal().getClass(),
                             new ThrashMetal().getClass(), new SpeedMetal().getClass(), new PowerMetal().getClass(),
                            new DeathMetal().getClass(), new BlackMetal().getClass(), new ProgressiveMetal().getClass(),
                             new GothicMetal().getClass(), new SymphonicMetal().getClass(), new FolkMetal().getClass(),
                            new AlternativeMetal().getClass(), new IndustrialMetal().getClass(), new Metalcore().getClass()};
       sysadmin.load(playlist);
    }
}
