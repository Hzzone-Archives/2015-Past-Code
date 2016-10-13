package com.patterns;

/**
 * 使用武器的人物的父类
 * 在某一时刻人物会持有某种武器
 * 通过该武器对象完成人物的fight服务
 */
public class Character {
    /**
     * 使用武器的人物持有一个具体的武器对象
     */
    private Weapon weapon;

    /**
     * 构造方法，传入一个具体的武器对象
     * @param aWeapon 具体的武器对象
     */
    public Character(Weapon aWeapon) {
       this.weapon = aWeapon;
    }

    /**
     * 武器对象设置方法，传入一个具体的武器对象
     * @param aNewWeapon 新的具体武器对象
     */
    public void setWeapon(Weapon aNewWeapon) {
       this.weapon = aNewWeapon;
    }

    /**
     * 人物使用武器类的fight服务为客户端提供fight服务
     * 根据具体需求，该方法可以有传入参数和返回值
     */
    public void fightUsingWeapon() {
       //人物通过使用持有的具体武器对象使用武器类提供的fight服务
       weapon.fight();
    }
}
