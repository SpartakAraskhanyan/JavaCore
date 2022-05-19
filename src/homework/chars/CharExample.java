package homework.chars;

public class CharExample {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'y', 's', 'p', 'u', 'i'};
        // ete ksksvi s ev p sinvolnerov tpe true
        char f = 's';
        char h = 'p';

//        if (chars[0] == f && chars[1] == h) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }


//        if (chars[chars.length - 1] == f && chars[chars.length - 2] == h) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//
//
//        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == f && chars[i+1]  == h) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}

