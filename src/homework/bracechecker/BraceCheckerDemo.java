package homework.bracechecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = "[hello) java i'm Spartak}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
