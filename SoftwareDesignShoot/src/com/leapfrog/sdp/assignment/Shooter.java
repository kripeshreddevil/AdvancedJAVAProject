/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sdp.assignment;

/**
 *
 * @author Home
 */
public class Shooter {
    private Shootable shoot;
    /**
     * Default constructor
     */
    public Shooter(){
        this.shoot = new Football();
        
    }
    public Shooter(Shootable shoot){
        this.shoot = shoot;
        
    }
    public void Shooting (){
        shoot.shoot();
        
    }
}

