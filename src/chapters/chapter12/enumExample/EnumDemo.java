package chapters.chapter12.enumExample;

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("znachenie ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("peremennaya ap soderzhit GoldenDel. \n");
        }
        switch (ap) {
            case Jonathan:
                System.out.println("sort Jonathan krasni.");
                break;
            case GoldenDel:
                System.out.println("sort Golden Delicious zhelti");
                break;
            case RedDel:
                System.out.println("sort Red Delicious krasni");
                break;
            case Winesap:
                System.out.println("sort Winesap krasni");
                break;
            case Cortland:
                System.out.println("sort Cortland krasni");
                break;
        }
    }
}
