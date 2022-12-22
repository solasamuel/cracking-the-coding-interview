import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Exercise4 {

    public static class TowersOfHanoi {
        ArrayList<Stack> towers;
        int numOfDisks;

        public TowersOfHanoi(int n) {
            numOfDisks = n;

            // add stacks to represent the towers
            towers = new ArrayList<>();
            towers.add(new Stack<Integer>());
            towers.add(new Stack<Integer>());
            towers.add(new Stack<Integer>());

            // add disks to first tower represented by their size
            for (int i=numOfDisks; i>0; i--) {
                towers.get(0).push(i);
            }

        }

        public void printTowers() {
            System.out.println("Stack 1");
            System.out.println(towers.get(0));

            System.out.println("Stack 2");
            System.out.println(towers.get(1));

            System.out.println("Stack 3");
            System.out.println(towers.get(2));
        }

        public static void main(String[] args) {
            TowersOfHanoi hanoi = new TowersOfHanoi(5);

            hanoi.printTowers();

            hanoi.runHanoi(5, 1, hanoi.towers.size());
        }

        public void runHanoi(int numOfDisks, int start, int end) {
            if (numOfDisks == 1) {
                moveDisk(start, end);
            } else {
                int otherTower = 6 - (start + end);
                runHanoi(numOfDisks-1, start, otherTower);
                moveDisk(start, end);
                runHanoi(numOfDisks-1, otherTower, end);
            }
        }

        public void moveDisk(int start, int end) {
            System.out.println("-------------");
            Stack startingStack = towers.get(start-1);
            Stack endingStack = towers.get(end-1);

            int disk = (int) startingStack.pop();

            endingStack.push(disk);
            printTowers();
        }

    }
}
