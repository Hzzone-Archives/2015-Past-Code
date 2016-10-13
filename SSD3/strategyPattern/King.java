package com.patterns;

public class King extends Character {
    /**
     * 唯一的国王，初始化时使用武器Bow
     */
    private static King king = new King(new Bow());

    /**
     * 私有的构造方法，传入一个具体的武器对象
     * @param aWeapon 具体的武器对象
     */
    private King(Weapon aWeapon) {
       super(aWeapon);
    }
    
    /**
     * 拜见国王陛下方法
     * @return king 唯一的国王
     */
    public static King getKing() {
       return king;
    }
}
