package edu.eci.arsw.math;

public class Pause {
    private boolean paused = false;
    private int countDigits = 0;

    public synchronized void pause(){
        paused = false;
    }

    public synchronized void resume(){
        paused = true;
        notifyAll();
    }
  
}
