package com.patterns;

public class Queen extends Character {
    /**
     * 唯一的皇后，初始化时使用武器Arrow
     */
    private static Queen queen = new Queen(new Arrow());

    /**
     * 私有的构造方法，传入一个具体的武器对象
     * @param aWeapon 具体的武器对象
     */
    private Queen(Weapon aWeapon) {
       super(aWeapon);
    }
    
    /**
     * 拜见皇后殿下方法
     * @return queen 唯一的皇后
     */
    public static Queen getQueen() {
       return queen;
    }
}
