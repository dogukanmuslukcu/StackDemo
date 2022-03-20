public class Main {

    public static void main(String[] args) {
//push() stack'a yeni veri eklemek için kullanılır
        //peek() stackin en üstündeki veriyi okur
        //pop() stackin en üstündeki veriyi siler
        //contains() stackde arama yapar
        //clear() siler
        //toArray() stacki diziye atar
        Stack stack = new Stack(6);

        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        stack.list();
        System.out.println("----------");
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("----------");
        stack.list();

        StackForString stackForString = new StackForString();
        stackForString.push("Adana1");
        stackForString.push("Adana2");
        stackForString.push("Adana3");
        stackForString.push("Adana4");
        stackForString.push("Adana5");
        stackForString.push("Adana6");
        stackForString.push("Adana7");
        stackForString.push("Adana8");
        stackForString.push("Adana9");
        stackForString.push("Adana10");

       stack.list();System.out.println("------------------------");
      System.out.println(stack);




    }
}
