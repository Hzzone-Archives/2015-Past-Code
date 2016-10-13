package com.patterns;

/**
 * ʹ������������ĸ���
 * ��ĳһʱ����������ĳ������
 * ͨ��������������������fight����
 */
public class Character {
    /**
     * ʹ���������������һ���������������
     */
    private Weapon weapon;

    /**
     * ���췽��������һ���������������
     * @param aWeapon �������������
     */
    public Character(Weapon aWeapon) {
       this.weapon = aWeapon;
    }

    /**
     * �����������÷���������һ���������������
     * @param aNewWeapon �µľ�����������
     */
    public void setWeapon(Weapon aNewWeapon) {
       this.weapon = aNewWeapon;
    }

    /**
     * ����ʹ���������fight����Ϊ�ͻ����ṩfight����
     * ���ݾ������󣬸÷��������д�������ͷ���ֵ
     */
    public void fightUsingWeapon() {
       //����ͨ��ʹ�ó��еľ�����������ʹ���������ṩ��fight����
       weapon.fight();
    }
}
