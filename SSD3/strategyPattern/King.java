package com.patterns;

public class King extends Character {
    /**
     * Ψһ�Ĺ�������ʼ��ʱʹ������Bow
     */
    private static King king = new King(new Bow());

    /**
     * ˽�еĹ��췽��������һ���������������
     * @param aWeapon �������������
     */
    private King(Weapon aWeapon) {
       super(aWeapon);
    }
    
    /**
     * �ݼ��������·���
     * @return king Ψһ�Ĺ���
     */
    public static King getKing() {
       return king;
    }
}
