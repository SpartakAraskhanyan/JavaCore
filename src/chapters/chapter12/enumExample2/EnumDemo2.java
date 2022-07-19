package chapters.chapter12.enumExample2;

class EnumDemo2{
    public static void main(String[] args) {
        Apple ap;
        System.out.println("konstanti perechislimogo tipa Apple:");
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("peremennaia ap soderzhit " + ap);
    }
}