
package com.leapfrog.sdp;
import com.leapfrog.sdp.assignment.Football;
import com.leapfrog.sdp.assignment.Movie;
import com.leapfrog.sdp.assignment.Shoot;
import com.leapfrog.sdp.assignment.Shootable;
import com.leapfrog.sdp.assignment.Shooter;
import com.leapfrog.sdp.assignment.Sniper;

public class Program{
    

    public static void main(String[] args) {
        Shooter s=new Shooter(new Movie());
        s.Shooting();
        
        
    }
}
