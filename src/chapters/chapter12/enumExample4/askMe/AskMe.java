package chapters.chapter12.enumExample4.askMe;

import chapters.chapter12.enumExample4.Answers;

public class AskMe {
    public static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("da");
                break;
            case MAYBE:
                System.out.println("vozmozhno");
                break;
            case LATER:
                System.out.println("pozdnee");
            case SOON:
                System.out.println("vskore");
                break;
            case NEVER:
                System.out.println("nikogda");
        }
    }
}