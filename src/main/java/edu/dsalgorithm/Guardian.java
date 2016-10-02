package edu.dsalgorithm;

/**
 * Created by elmarce on 01/10/16.
 */
public class Guardian {

    //Name of the person who has each key;
    String lendedTo[] = new String[3];

    // number of keys
    private int keys;

    public Guardian() {
        keys = 10;
    }

    public Guardian(int keyCount) {
        keys = keyCount;
    }

    public void lend() {
        if (keys > 0) {
            keys -= 1;
        }
    }

    public void retrieve() {
        if (keys != 10) {
            keys += 1;
        }
    }

    public int getKeyCount() {
        return keys;
    }
}
