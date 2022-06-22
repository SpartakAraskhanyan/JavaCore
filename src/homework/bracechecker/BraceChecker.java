package homework.bracechecker;


public class BraceChecker {
    String text;

    BraceChecker(String text) {
        this.text = text;

    }

    void check() {
        System.out.println(text);

        char[] chars = text.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;

                case ')':
                    int s = (int) stack.pop();
                    if (s == 0) {
                        System.out.println("Error: closed " + c + "but not opened at" + i);

                    } else if (s != '(') {
                        System.out.println("Error:" + "opened" + s + " " + "but closed" + chars[i] + i);
                    }
                case '}':
                    int x = (int) stack.pop();
                    if (x == 0) {
                        System.out.println("Error: closed " + c + "but not opened at" + i);


                    } else if (x != '{') {
                        System.out.println("Error:" + "opened" + x + " " + "but closed" + chars[i] + i);
                    }



                case ']':
                    int y = (int) stack.pop();
                    if (y == 0) {
                        System.out.println("Error: closed " + c + "but not opened at" + i);

                    } else if (y != '[') {
                        System.out.println("Error:" + "opened" + y + " " + "but closed" + chars[i] + i);
                    }


            }

        }
    }

}

