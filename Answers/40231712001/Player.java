import java.util.Random;

class Player implements Success {
    String name;
    int number;
    int prob;

    public boolean isSuccessful() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int num = (rand.nextInt(100)) + 1;
        if (num <= prob) return true;
        else return false;
    }
}
