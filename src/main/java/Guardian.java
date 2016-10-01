/**
 * Created by elmarce on 01/10/16.
 */
public class Guardian {

    int keys = 10;

    public void lend() {
        keys -= 1;
    }

    public void retrieve() {
        keys += 1;
    }
}
