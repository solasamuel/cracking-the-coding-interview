import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    @Test
    public void runHanoiWith3Disks() {
        int numberOfDisks = 3;
        Exercise4.TowersOfHanoi hanoi = new Exercise4.TowersOfHanoi(numberOfDisks);

        hanoi.printTowers();

        hanoi.runHanoi(numberOfDisks, 1, hanoi.towers.size());
    }

    @Test
    public void runHanoiWith5Disks() {
        int numberOfDisks = 5;
        Exercise4.TowersOfHanoi hanoi = new Exercise4.TowersOfHanoi(numberOfDisks);

        hanoi.printTowers();

        hanoi.runHanoi(numberOfDisks, 1, hanoi.towers.size());
    }

}