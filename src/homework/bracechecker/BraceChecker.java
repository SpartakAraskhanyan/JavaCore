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
                    char s = (char) stack.pop();
                    if (s != '(') {
                        System.out.println("Error:" + "opened" + s + " " + "but closed" + chars[i] + i);
                    }else if (s != '[' || s != '{'){

                        System.out.println("Error:" + "not opened" + s + " " + "but closed" + chars[i] + i);
                    }

                    break;
                case '}':
                    char x = (char) stack.pop();
                    if (x != '{') {
                        System.out.println("Error:" + "opened" + x + " " + "but closed" + chars[i] + i);
                    }else if (x != '[' || x != '('){

                        System.out.println("Error:" + "not opened" + x + " " + "but closed" + chars[i] + i);
                    }
                    break;
                case ']':
                    char y = (char) stack.pop();
                    if (y != '[') {
                        System.out.println("Error:" + "opened" + y + " " + "but closed" + chars[i] + i);
                    }else if (y != '(' || y != '{'){

                        System.out.println("Error:" + "not opened" + y + " " + "but closed" + chars[i] + i);
                    }
                    break;


            }


        }
    }

}
