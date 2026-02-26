package edu.eci.arsw.math;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Getter
@RequiredArgsConstructor
public class PiDigitsThread extends Thread {
    private int start;
    private int end;
    private List<Integer> occurrences = new LinkedList<>();
    private Pause pauseControl;
    private int count = 0;


    @Override
    public void run() {
        PiDigits pd = new PiDigits();

        
        for (int k = start; k < end; k++){
            count++;
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true){
                Thread.sleep(5);
                pauseControl.pause();

                System.out.println("\nPaused");
                System.out.println("Total de digitos");
                System.out.println("Press Enter to Continue...");

                br.readLine();
                pauseControl.resume();

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}