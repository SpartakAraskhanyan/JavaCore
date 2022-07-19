package chapters.chapter12.enumExample2;

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(15), Cortland(8);
    private int price;

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}