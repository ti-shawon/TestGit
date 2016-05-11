package com.company;

/**
 * Created by TIS on 5/11/2016.
 */
public abstract class EnemyShip {

        private String Ename;
        private double speed;
        private double directionX;
        private double directionY;
        private double Damage;

        public String getName() { return Ename; }
        public void setName(String newName) { Ename = newName; }

        public double getDamage() { return Damage; }
        public void setDamage(double newDamage) { Damage = newDamage; }

        public void followHeroShip(){

        System.out.println(getName() + " is following the hero");

        }

        public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");
        }

        public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

        }

}

