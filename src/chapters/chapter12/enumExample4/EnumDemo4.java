package chapters.chapter12.enumExample4;

import chapters.chapter12.enumExample4.question.Question;

import java.util.Random;

import static chapters.chapter12.enumExample4.askMe.AskMe.answer;

public class EnumDemo4 {
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }

}
