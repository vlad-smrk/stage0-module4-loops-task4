package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }

        int sumSkipped = 0;
        int sumCounted = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                sumSkipped += i;
                continue;
            }
            sumCounted += i;
        }
        System.out.println("skipped sum is number" + sumSkipped);
        System.out.println("counted sum is number" + sumCounted);
    }
}
