public class StackForString {
    private String[] elements;
    private int top;



    public StackForString() {
        elements = new String[10];
        top = 0;

    }


    public void push(String element) {
        elements[top] = element;
        top++;
    }

    public String pop() {
        top--;
        return elements[top];
    }

    public String peek() {
        return elements[top - 1];
    }

    public void list() {
        System.out.println(top);
        for (int i = top - 1; i >= 0; i--) {
            if (elements[i] != null) {
                System.out.println(elements[i] + "  " + i + ".eleman");
            }

        }
    }

    public void search(String element) {
        boolean is = false;
        int order = 0;
        for (String x : elements) {
            order++;
            if (x.equals(element)) {

                is = true;
                break;
            }
        }

        if (is) {
            System.out.println(order + ".sıradadır =>" + element);
        } else {
            System.out.println("aradığınız kelime bulunmamaktadır");
        }

    }
}
