package rsa;

import robocode.*;
import robocode.Robot;
import java.awt.*;

public class BriansRobot extends Robot {

    private String lastPersonWhoHitMeThatsDisrespectful = null;

    public void run() {
        setBodyColor(Color.black);
        setBulletColor(Color.red);
        setGunColor(Color.yellow);
        setRadarColor(Color.ORANGE);
        setScanColor(Color.white);

        while (true) {
            turnRight(360);
        }
    }

    //This method is called when your robot sees another robot, i.e. when the robot's radar scan "hits" another robot.
    public void onScannedRobot(ScannedRobotEvent event) {
        if (event.getVelocity() == 0) {
            fire(3);
        }
        else if (event.getDistance() <= 150) {
            fire(2);
        }
        else {
            fire(1);
        }
//        if (event.getName().equalsIgnoreCase(lastPersonWhoHitMeThatsDisrespectful) && event.get) {
//            fire (3);
//        }
//        else {
//            if (event.getDistance() <=200 ) {
//                fire(1);
//            }
//            else {
//                fire(3);
//            }
//        }
    }

    //This method is called when your robot collides with a wall.
    public void onHitWall(HitWallEvent event) {
        turnRight(180);
        ahead(200);
    }

    //This method is called when your robot collides with another robot.
    public void onHitRobot(HitRobotEvent event) {
        back(65);
        turnRight(23);
        ahead(50);
    }

    //This method is called when your robot is hit by a bullet.
    public void onHitByBullet(HitByBulletEvent event) {
         lastPersonWhoHitMeThatsDisrespectful= event.getName();
         turnRight(90);
         ahead(500);
    }

    //This method is called when one of your bullets misses, i.e. hits a wall.
    public void onBulletMissed(BulletMissedEvent event) {
        //goCrazy();
    }

    //This method is called when one of your bullets hits another bullet.
    public void onBulletHitBullet(BulletHitBulletEvent event) {
    }

    //This method is called when one of your bullets hits another robot.
    public void onBulletHit(BulletHitEvent event) {

    }




//    getOthers()
//    Returns how many opponents that are left in the current round
//
//    getEnergy()
//    Returns the robot's current energy.
//
//    fire(double power)
//    Immediately fires a bullet.
//
//    doNothing()
//    Do nothing this turn, meaning that the robot will skip it's turn.
//
//    back(double distance)
//    Immediately moves your robot backward by distance measured in pixels.
//
//    ahead(double distance)
//    Immediately moves your robot ahead (forward) by distance measured in pixels.
}


