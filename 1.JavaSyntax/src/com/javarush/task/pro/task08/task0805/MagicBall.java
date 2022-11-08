package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random r = new Random();
        int rand = r.nextInt(8);
        if (rand == 0) {
            return CERTAIN;
        }
        if (rand == 1) {
            return DEFINITELY;
        }
        if (rand == 2) {
            return MOST_LIKELY;
        }
        if (rand == 3) {
            return OUTLOOK_GOOD;
        }
        if (rand == 4) {
            return ASK_AGAIN_LATER;
        }
        if (rand == 5) {
            return TRY_AGAIN;
        }
        if (rand == 6) {
            return NO;
        }
        if (rand == 7) {
            return VERY_DOUBTFUL;
        }
        return null;
    }
}
