package chapters.chapter12.enumExample4.question;

import chapters.chapter12.enumExample4.Answers;

import java.util.Random;

public class Question {
    Random rand = new Random();

    public Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 75)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }
}