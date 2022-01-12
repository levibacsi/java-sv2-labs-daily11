package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private final int numbersToDrawFrom;
    private final int numberOfDraws;
    Random random = new Random();

    public Lottery(int numberOfDraws, int numbersToDrawFrom) {
        this.numbersToDrawFrom = numbersToDrawFrom;
        this.numberOfDraws = numberOfDraws;
    }

    public List<Integer> startLottery() {
        List<Integer> lotteryNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfDraws; i++) {
            int randomNumber = 1 + random.nextInt(numbersToDrawFrom);
            if (!lotteryNumbers.contains(randomNumber)) {
                lotteryNumbers.add(randomNumber);
            }
        }
        return lotteryNumbers;
    }
}
