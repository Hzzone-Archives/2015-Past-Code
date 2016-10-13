package com.patterns;

public class Queen extends Character {
    /**
     * Ψһ�Ļʺ󣬳�ʼ��ʱʹ������Arrow
     */
    private static Queen queen = new Queen(new Arrow());

    /**
     * ˽�еĹ��췽��������һ���������������
     * @param aWeapon �������������
     */
    private Queen(Weapon aWeapon) {
       super(aWeapon);
    }
    
    /**
     * �ݼ��ʺ���·���
     * @return queen Ψһ�Ļʺ�
     */
    public static Queen getQueen() {
       return queen;
    }
}
