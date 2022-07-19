package chapters.chapter12.enumExample2;

class EnumDemo21 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("yabloko sorta Winesap stoit " + Apple.Winesap.getPrice() + "centov.\n");
        System.out.println("ceni na vse sorta yablok: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " stoit " + a.getPrice() + "centov");
            
        }
    }
}


