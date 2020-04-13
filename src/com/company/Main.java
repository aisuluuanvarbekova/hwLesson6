
package com.company;
public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(500, 300,"Power", new Weapon("огнестрельный", "Огнестрельный К - 47"));


        System.out.println("" + boss.getHealth() + " " + boss.getDamage() + " " + boss.getSuperAbilities() + " " + boss.getWeapon());
    }
    
}