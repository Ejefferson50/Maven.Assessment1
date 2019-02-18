package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer numOfJumps = 0;
        if (k / j == 0){
            numOfJumps = k / j;

        }else if (k % 2 == 1){
            int result = k / j;
            numOfJumps = result + 1;
        }
        return numOfJumps;
    }
}
